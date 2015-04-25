/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import Connect.HistoryDao;
import GetterSetter.GS_History;
import GetterSetter.GS_HistoryRes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.servlet.RequestDispatcher;
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
    private static int getCount;
    private static String[] strHistory;
    
    private static String moviename1;
    private static String movieplot1;
    private static String movieyear1;
    private static String moviename2;
    private static String movieplot2;
    private static String movieyear2;
    private static String moviename3;
    private static String movieplot3;
    private static String movieyear3;
    private static String moviename4;
    private static String movieplot4;
    private static String movieyear4;
    private static String moviename11;
    private static String movieplot11;
    private static String movieyear11;
    private static String moviename21;
    private static String movieplot21;
    private static String movieyear21;
    private static String moviename31;
    private static String movieplot31;
    private static String movieyear31;
    private static String moviename41;
    private static String movieplot41;
    private static String movieyear41;
    private static String moviename12;
    private static String movieplot12;
    private static String movieyear12;
    private static String moviename22;
    private static String movieplot22;
    private static String movieyear22;
    private static String moviename32;
    private static String movieplot32;
    private static String movieyear32;
    private static String moviename42;
    private static String movieplot42;
    private static String movieyear42;
    

    
    
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
           String qry1="select hr.date FROM GS_HistoryRes hr";
           Query q1=session.createQuery(qry1);
           List l1=q1.list();
           ListIterator li1=l1.listIterator();
           
           //System.out.println(l1);
           getCount=l1.size();
           System.out.println(getCount);
           strHistory=new String[getCount*4];
           
           int counter=0;
           int iter=0;
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
                        if(iter<11)
                        {
                            GS_History movieaaa=(GS_History) iterator.next();
                        
                            //strHistory[counter]=history.getDate()+","+history.getName()+","+history.getPlot()+","+history.getYear();
                            /*
                            System.out.println(history.getDate());
                            System.out.println(history.getId());
                            System.out.println(history.getName());
                            System.out.println(history.getPlot());
                            System.out.println(history.getYear());*/
                            System.out.println(iter);
                            switch(iter)
                    {
                        case 0: moviename1=movieaaa.getName();
                                movieplot1=movieaaa.getPlot();
                                movieyear1=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename1);
                                System.out.println("Plot: "+ movieplot1);
                                System.out.println("Year: "+movieyear1);
                                break;
                        case 1: moviename2=movieaaa.getName();
                                movieplot2=movieaaa.getPlot();
                                movieyear2=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename2);
                                System.out.println("Plot: "+ movieplot2);
                                System.out.println("Year: "+movieyear2);
                                break;
                        case 2: moviename3=movieaaa.getName();
                                movieplot3=movieaaa.getPlot();
                                movieyear3=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename3);
                                System.out.println("Plot: "+ movieplot3);
                                System.out.println("Year: "+movieyear3);
                                break;
                        case 3: moviename4=movieaaa.getName();
                                movieplot4=movieaaa.getPlot();
                                movieyear4=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename4);
                                System.out.println("Plot: "+ movieplot4);
                                System.out.println("Year: "+movieyear4);
                                break;
                        
                        case 4: moviename11=movieaaa.getName();
                                movieplot11=movieaaa.getPlot();
                                movieyear11=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename11);
                                System.out.println("Plot: "+ movieplot11);
                                System.out.println("Year: "+movieyear11);
                                
                                
                                
            
                                break;
                        case 5: moviename21=movieaaa.getName();
                                movieplot21=movieaaa.getPlot();
                                movieyear21=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename21);
                                System.out.println("Plot: "+ movieplot21);
                                System.out.println("Year: "+movieyear21);
                                break;
                        case 6: moviename31=movieaaa.getName();
                                movieplot31=movieaaa.getPlot();
                                movieyear31=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename31);
                                System.out.println("Plot: "+ movieplot31);
                                System.out.println("Year: "+movieyear31);
                                break;
                        case 7: moviename41=movieaaa.getName();
                                movieplot41=movieaaa.getPlot();
                                movieyear41=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename41);
                                System.out.println("Plot: "+ movieplot41);
                                System.out.println("Year: "+movieyear41);
                                break;
                            
                        case 8: moviename12=movieaaa.getName();
                                movieplot12=movieaaa.getPlot();
                                movieyear12=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename12);
                                System.out.println("Plot: "+ movieplot12);
                                System.out.println("Year: "+movieyear12);
                                break;
                        case 9: moviename22=movieaaa.getName();
                                movieplot22=movieaaa.getPlot();
                                movieyear22=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename22);
                                System.out.println("Plot: "+ movieplot22);
                                System.out.println("Year: "+movieyear22);
                                break;
                        case 10: moviename32=movieaaa.getName();
                                movieplot32=movieaaa.getPlot();
                                movieyear32=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename32);
                                System.out.println("Plot: "+ movieplot32);
                                System.out.println("Year: "+movieyear32);
                                break;
                        case 11: moviename42=movieaaa.getName();
                                movieplot42=movieaaa.getPlot();
                                movieyear42=String.valueOf(movieaaa.getYear());
                                System.out.println("Rec Movie name: " + moviename42);
                                System.out.println("Plot: "+ movieplot42);
                                System.out.println("Year: "+movieyear42);
                                break;
                   
                    }
                }
                counter++;
                iter++;
                    
               }
           }
           }
           catch(Exception e)
           {
              System.out.println(e);
           }
                
        }
        catch(Exception e)
        {
            System.out.println(e);
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
            
            request.setAttribute("name1",moviename1 );
            request.setAttribute("plot1", movieplot1);
            request.setAttribute("year1", movieyear1);
            request.setAttribute("name2",moviename2 );
            request.setAttribute("plot2", movieplot2);
            request.setAttribute("year2", movieyear2);
            request.setAttribute("name3",moviename3 );
            request.setAttribute("plot3", movieplot3);
            request.setAttribute("year3", movieyear3);
            request.setAttribute("name4",moviename4 );
            request.setAttribute("plot4", movieplot4);
            request.setAttribute("year4", movieyear4);
            request.setAttribute("name11",moviename11 );
            request.setAttribute("plot11", movieplot11);
            request.setAttribute("year11", movieyear11);
            request.setAttribute("name21",moviename21 );
            request.setAttribute("plot21", movieplot21);
            request.setAttribute("year21", movieyear21);
            request.setAttribute("name31",moviename31 );
            request.setAttribute("plot31", movieplot31);
            request.setAttribute("year31", movieyear31);
            request.setAttribute("name41",moviename41 );
            request.setAttribute("plot41", movieplot41);
            request.setAttribute("year41", movieyear41);
            request.setAttribute("name12",moviename12 );
            request.setAttribute("plot12", movieplot12);
            request.setAttribute("year12", movieyear12);
            request.setAttribute("name22",moviename22 );
            request.setAttribute("plot22", movieplot22);
            request.setAttribute("year22", movieyear22);
            request.setAttribute("name32",moviename32 );
            request.setAttribute("plot32", movieplot32);
            request.setAttribute("year32", movieyear32);
            request.setAttribute("name42",moviename42 );
            request.setAttribute("plot42", movieplot42);
            request.setAttribute("year42", movieyear42);
            
            System.out.println(moviename1);
            System.out.println(movieplot1);
            System.out.println(movieyear1);
            System.out.println(moviename2);
            System.out.println(movieplot2);
            System.out.println(movieyear2);
            System.out.println(moviename3);
            System.out.println(movieplot3);
            System.out.println(movieyear3);
            System.out.println(moviename4);
            System.out.println(movieplot4);
            System.out.println(movieyear4);
            System.out.println("Here\n");
            
            System.out.println(moviename11);
            System.out.println(movieplot11);
            System.out.println(movieyear11);
            System.out.println(moviename21);
            System.out.println(movieplot21);
            System.out.println(movieyear21);
            System.out.println(moviename31);
            System.out.println(movieplot31);
            System.out.println(movieyear31);
            System.out.println(moviename41);
            System.out.println(movieplot41);
            System.out.println(movieyear41);
            System.out.println("Here1\n");
            
            System.out.println(moviename12);
            System.out.println(movieplot12);
            System.out.println(movieyear12);
            System.out.println(moviename22);
            System.out.println(movieplot22);
            System.out.println(movieyear22);
            System.out.println(moviename32);
            System.out.println(movieplot32);
            System.out.println(movieyear32);
            System.out.println(moviename42);
            System.out.println(movieplot42);
            System.out.println(movieyear42);
            System.out.println("Here\n");
            
            
            RequestDispatcher rd=request.getRequestDispatcher("result_his.jsp");
            rd.forward(request, response);
            
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
