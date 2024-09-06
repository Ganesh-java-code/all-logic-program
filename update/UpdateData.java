package in.ganesh.update;

import in.ganesh.entity.Employee;
import in.ganesh.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateData {
    public static void main(String[] args) {

        SessionFactory factory = HibernateUtils.getSessionFactory();
        //session
        Session session = factory.openSession();

        Employee load = session.load(Employee.class, 102);
        load.setEmpName("Sachin Patil");
        session.beginTransaction();
        session.update(load);
        session.getTransaction().commit();
        session.close();


    }
}
