package Connect;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Shail Shah
 */
public class HConnect {
   
    private static ServiceRegistry serviceRegistry;
    private static SessionFactory  sessionFactory;

    public static void main(String[] args) {
        try {
            Configuration configuration = new Configuration();

            configuration.configure();
            serviceRegistry =
                new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            // return sessionFactory;
            System.out.println(sessionFactory);
        } catch (HibernateException ex) {
            System.err.println("Failed to create sessionFactory object." + ex);

            throw new ExceptionInInitializerError(ex);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
