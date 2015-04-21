/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import GetterSetter.GS_History;
import GetterSetter.GS_HistoryRes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class GetHistory extends HttpServlet {
    private static StandardServiceRegistry serviceRegistry;
    private static SessionFactory sessionFactory;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public static void listHistory()
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = new Configuration().configure().buildSessionFactory(serviceRegistry).openSession();
        String date;
        
        Transaction tx = null;
        
        try{
           tx = session.beginTransaction();
           String qry1="select date FROM GS_HistoryRes hr";
           Query q1=session.createQuery(qry1);
           List l1=q1.list();
           ListIterator li1=l1.listIterator();
           
           //System.out.println(l1);
           int getCount=l1.size();
           System.out.println(getCount);
           
           
           try{
               for(int i=0;i<getCount;i++)
               {
                    date=(String)li1.next().toString();
                    
                    //System.out.println(date);
                    
                
                    String qry2="FROM GS_History h where h.date=:date";
                    Query q2=session.createQuery(qry2);
                    q2.setParameter("date", date);
                    
                    List l2=q2.list();
                    for(Iterator iterator=l2.iterator(); iterator.hasNext();)
                    {
                        GS_History history=(GS_History) iterator.next();
                        
                        System.out.println(history.getDate());
                        System.out.println(history.getId());
                        System.out.println(history.getName());
                        System.out.println(history.getPlot());
                        System.out.println(history.getYear());
                    }
                    
                    
               }
           }
           catch(Exception e)
           {
               
           }
                
        }
        catch(Exception e)
        {
            
        }
        
    }
        
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           /* out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetHistory</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GetHistory at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
            
            listHistory();
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
