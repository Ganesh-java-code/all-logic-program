package in.ganesh.fetch;

import in.ganesh.entity.Employee;
import in.ganesh.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RetrieveData {
    public static void main(String[] args) {

        SessionFactory factory = HibernateUtils.getSessionFactory();

        //session
        Session session = factory.openSession();

        session.beginTransaction();
        Employee employee = session.get(Employee.class, 102);
        session.getTransaction().commit();
        System.out.println(employee);

        session.close();

    }
}
