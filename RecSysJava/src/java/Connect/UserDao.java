
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Connect;

//~--- non-JDK imports --------------------------------------------------------

import GetterSetter.GS_Reg;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class UserDao {
    private static ServiceRegistry serviceRegistry;
    private static SessionFactory  sessionFactory;

    public static int register(GS_Reg u) {
        int           i             = 0;
        Configuration configuration = new Configuration();

        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Session     session = new Configuration().configure().buildSessionFactory(serviceRegistry).openSession();
        
        Transaction t=null;
        

        try {
            t       = session.beginTransaction();
           // t.begin();
        i = (Integer) session.save(u);
                    t.commit();
        } catch (Exception ex) {
            t.rollback();
            ex.printStackTrace();
            //String str=hello;
            //ServletContext.log(ex,str);
             // ServletContext.getContext().log();
            //throw ex;
        } finally {
            session.close();

            return i;
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
