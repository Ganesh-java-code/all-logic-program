package in.ganesh.create;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import in.ganesh.entity.Employee;
import in.ganesh.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateEmployee {


    public static void main(String[] args) {

        //configuration

        SessionFactory factory = HibernateUtils.getSessionFactory();

        //session
        Session session = factory.openSession();

        Employee emp = new Employee();
        emp.setEmpId(102);
        emp.setEmpName("sachin");
        emp.setEmpSal(2000.0);

        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
        session.close();

    }


}