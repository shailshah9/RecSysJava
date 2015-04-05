/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import Algorithm.KLDivergence;
import GetterSetter.GS_Movkld;
import com.google.common.primitives.Doubles;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author bsnl
 */
public class GetMovies extends HttpServlet {
    private static ServiceRegistry serviceRegistry;
    private static SessionFactory  sessionFactory;
    private static List id;
    public static void listMovies(String movname)
    {
        
        Configuration configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = new Configuration().configure().buildSessionFactory(serviceRegistry).openSession();
        /*double p1[]={0.1,0.2,0.3,0.4};
        double p2[]={0.15,0.2,0.4,0.25};*/
        Transaction tx = null;
        try{
           tx = session.beginTransaction();
           System.out.println("Input movie: "+movname);
           String qry="select m.movid from GS_Movie m where m.name= :movname";
           
           Query p1=session.createQuery(qry);
           p1.setParameter("movname", movname);
           List p11=p1.list();
           try
           {
                //System.out.println(p11.iterator().next());
                String movid=(String) p11.iterator().next();
                //System.out.println(movid);
                Query qrya=session.createQuery("From GS_Movkld l where l.movid=:movid");
                qrya.setParameter("movid", movid);
                List movies1 = qrya.list();
                Iterator iterator1=movies1.iterator();
                GS_Movkld moviea = (GS_Movkld) iterator1.next(); 
                ArrayList<Double> m1=new ArrayList<Double>();
                m1.add(moviea.getAction());
                m1.add(moviea.getAdventure());
                m1.add(moviea.getAnimation());
                m1.add(moviea.getComedy());
                m1.add(moviea.getCrime());
                m1.add(moviea.getDrama());
                //Query qry1=session.createQuery("From GS_Movkld");
                // qry1.setParameter("movid", movid);
                Query qryb = session.createQuery("From GS_Movkld l where l.movid!=:movid");
                qryb.setParameter("movid", movid);
                List movies = qryb.list();
                int i=0;
                HashMap<String,Double> map = new HashMap<String,Double>();
                //  ValueComparator bvc =  new ValueComparator(map);
                // TreeMap<String,Double> sorted_map = new TreeMap<String,Double>(bvc);
                //System.out.println(movies);
                for (Iterator iterator = movies.iterator(); iterator.hasNext();){              
                    GS_Movkld movie = (GS_Movkld) iterator.next(); 

                    ArrayList<Double> m2=new ArrayList<>();
                    m2.add(movie.getAction());
                    m2.add(movie.getAdventure());
                    m2.add(movie.getAnimation());
                    m2.add(movie.getComedy());
                    m2.add(movie.getCrime());
                    m2.add(movie.getDrama());
                    double[] m11=Doubles.toArray(m1);
                    double[] m22=Doubles.toArray(m2);
                    //Double temp = KLDivergence.klDivergence(m11, m22);
                    Double temp;
                     if((temp=KLDivergence.klDivergence(m11, m22))<=0.29999876)
                    {
                     /*   System.out.println("Movie #" + i);
                      System.out.println("Action: " + movie.getAction()); 
                      System.out.println("Comedy: " + movie.getComedy()); 
                      System.out.println("Drama: " + movie.getDrama()); 
                      i++;*/
                        map.put(movie.getMovid(),temp);
                    }
                    else
                    {
                        //System.out.println("Not recommended");
                        continue;
                    }
                }
                ArrayList as = new ArrayList( map.entrySet() );
         
                Collections.sort( as , new Comparator() {
                    public int compare( Object o1 , Object o2 )
                    {
                        Map.Entry e1 = (Map.Entry)o1 ;
                        Map.Entry e2 = (Map.Entry)o2 ;
                        Double first = (Double)e1.getValue();
                        Double second = (Double)e2.getValue();
                        return first.compareTo( second );
                    }
                });
                //List as1=as.subList(0, 5);
                Iterator j = as.iterator();
                System.out.println("\n\n\nSuggestions\n");
               
                while ( j.hasNext() && i<5)
                {
                   //System.out.println( (Map.Entry)j.next());
                    String temp=(String) ((Map.Entry)j.next()).getKey();
                    System.out.println("Rec Mov ID: "+temp);
                    String qry123="select m.name from GS_Movie m where m.movid= :movid";
           
                    Query p1123=session.createQuery(qry123);
                    p1123.setParameter("movid", temp);
                    List p111=p1123.list();
                    System.out.println("Rec Movie name: " + p111.iterator().next());
                    
                    i++;
                }
                
                tx.commit();
            }
            
            catch(NoSuchElementException nsee)
            {
                 System.out.println("No Such Movie Found!!");   
            }
          // response.sendRedirect("localhost:8080/RecSysJava");
        }catch (HibernateException e) {        
           if (tx!=null) tx.rollback();
           e.printStackTrace(); 
        }finally {
           session.close(); 
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String movname=request.getParameter("movie");
            listMovies(movname);
            request.setAttribute("rm", id);
            response.sendRedirect("result.jsp");
            
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
