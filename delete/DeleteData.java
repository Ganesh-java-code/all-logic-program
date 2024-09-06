package in.ganesh.delete;

import in.ganesh.entity.Employee;
import in.ganesh.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteData {
    public static void main(String[] args) {

        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session = factory.openSession();

        Employee employee = session.get(Employee.class, 101);

        session.beginTransaction();
        session.delete(employee);
        session.getTransaction().commit();

        factory.close();

    }
}
