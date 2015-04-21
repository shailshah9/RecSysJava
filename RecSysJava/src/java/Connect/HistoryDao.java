/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import GetterSetter.GS_History;
import GetterSetter.GS_HistoryRes;
import GetterSetter.GS_Movie;
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
public class HistoryDao {
    private static ServiceRegistry serviceRegistry;
    private static SessionFactory sessionFactory;

    public static int add(GS_History u) {
        int i = 0;
        Configuration configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();        
        Transaction t=null;
        try {
            t = session.beginTransaction();
           // t.begin();
            i = (Integer) session.save(u);
            t.commit();
        } catch (Exception ex) {
            if(t!=null)
            {
               t.rollback(); 
            }            
            ex.printStackTrace();            
        } finally {
            session.close();            
        }
        return i;
    }
}
