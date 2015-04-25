/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Shail Shah
 */
public class UpdateMovie extends HttpServlet {
    private StandardServiceRegistry serviceRegistry;
    private SessionFactory sessionFactory;
    private String name;
    private String year;
    private String plot;
    private String dir;
    private String prod;
    private String movid;
    private String cast;
    private String genre;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            name=(String) request.getAttribute("name");
            year=(String) request.getAttribute("year");
            
            plot=(String) request.getAttribute("plot");
            dir=(String) request.getAttribute("director");
            prod=(String) request.getAttribute("producer");
            movid=(String) request.getAttribute("movid");
            cast=(String) request.getAttribute("cast");
            genre=(String) request.getAttribute("genre");
            updateMov(name,year,plot,dir,prod,movid,cast,genre);
            response.sendRedirect("/RecSysJava/UpdateMovie/upmov.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void updateMov(String name, String year, String plot, String dir, String prod, String movid, String cast, String genre) {
        Configuration configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = new Configuration().configure().buildSessionFactory(serviceRegistry).openSession();
        Transaction tx = null;
        try{
           tx = session.beginTransaction();
            String hql = "UPDATE GS_Movie m set m.year = :year, m.plot=:plot, m.cast=:cast, m.genre=:genre, m.director=:dir, m.producer=:prod  "  + 
             "WHERE m.movid = :movid";
            Query query = session.createQuery(hql);
            query.setParameter("year", year);
            query.setParameter("plot",plot);
            query.setParameter("cast",cast);
            query.setParameter("dir",dir);
            query.setParameter("prod",prod);
            query.setParameter("movid",movid);
            query.setParameter("genre",genre);
            
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
            tx.commit();
        }
        
        catch (HibernateException e) {        
           if (tx!=null) tx.rollback();
           e.printStackTrace(); 
        }finally {
           session.close(); 
        }
    }

}
