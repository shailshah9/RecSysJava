/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import GetterSetter.GS_Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
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
public class GetMovDetails extends HttpServlet {
    private StandardServiceRegistry serviceRegistry;
    private SessionFactory sessionFactory;
    private int result;
    private String name;
    private String movid;
    private String plot;
    private String year;
    private String dir;
    private String genre;
    private String prod;
    private String cast;
    

    protected int getDetails(String movname)
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = new Configuration().configure().buildSessionFactory(serviceRegistry).openSession();
        
        Transaction tx = null;
        try{
           tx = session.beginTransaction();
            String hql = "FROM GS_Movie m where m.name=:movname";
            Query query = session.createQuery(hql);
            query.setParameter("movname", movname);
            List results = query.list();
            GS_Movie gS_Movie=(GS_Movie)results.iterator().next();
            name=gS_Movie.getName();
            movid=gS_Movie.getMovid();
            plot=gS_Movie.getPlot();
            year=String.valueOf(gS_Movie.getYear());
            dir=gS_Movie.getDirector();
            genre=gS_Movie.getGenre();
            prod=gS_Movie.getProducer();
            cast=gS_Movie.getCast();
            //Update mov details
            System.out.println(name);
            System.out.println(movid);
            System.out.println(plot);
            System.out.println(year);
            System.out.println(dir);
            System.out.println(genre);
            System.out.println(prod);
            System.out.println(cast);
            
            
            result=1;
            
        }
        catch (HibernateException e) {        
           if (tx!=null) tx.rollback();
           e.printStackTrace(); 
        }finally {
           session.close(); 
           return result;
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String mov=request.getParameter("movie");
            int x=getDetails(mov);
            if(x==1)
            {
                //response.sendRedirect("/RecSysJava/UpdateMovie/movdet.jsp");
                request.setAttribute("name", name);
                request.setAttribute("movid",movid);
                request.setAttribute("plot",plot);
                request.setAttribute("year",year);
                request.setAttribute("cast",cast);
                request.setAttribute("prod",prod);
                request.setAttribute("dir",dir);
                request.setAttribute("genre",genre);
                
                RequestDispatcher rd=request.getRequestDispatcher("/UpdateMovie/movdet.jsp");
                rd.forward(request, response);
            }
            else
                response.sendRedirect("/RecSysJava/UpdateMovie/upnomov.jsp");
            
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

}
