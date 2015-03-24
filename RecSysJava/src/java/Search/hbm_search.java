package Search;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.cfg.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * @author shail
 */
public class hbm_search {
    private static ServiceRegistry serviceRegistry;
    private static SessionFactory sessionFactory;
    public static void main(String[] args) {
        Session session = null;
        

        try {

           Configuration configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        session = new Configuration().configure().buildSessionFactory(serviceRegistry).openSession();

            // Create Select Clause HQL
            String SQL_QUERY = "Select movie.id,movie.movid,movie.name,movie.year,movie.plot,movie.genre,movie.cast,movie.producer,movie.director from movie";
            Query query = session.createQuery(SQL_QUERY);

            for (Iterator it = query.iterate(); it.hasNext(); ) {
                Object[] row = (Object[]) it.next();

                System.out.println("ID: " + row[0]);
                System.out.println("MovID: " + row[1]);
                System.out.println("Name: " + row[2]);
                System.out.println("Year: " + row[3]);
                System.out.println("Plot: " + row[4]);
                System.out.println("Genre: " + row[5]);
                System.out.println("Cast: "+row[6]);
                System.out.println("Director: "+row[7]);
                System.out.println("Producer: "+row[8]);
            }

            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {}
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
