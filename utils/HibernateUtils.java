package in.ganesh.utils;

import in.ganesh.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {

        if (sessionFactory==null){
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Employee.class);

            //session factory
            sessionFactory = configuration.buildSessionFactory();
        }

        return sessionFactory;
    }
}
