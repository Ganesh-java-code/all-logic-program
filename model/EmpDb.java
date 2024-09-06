package in.ganesh.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpDb {

    public static List<Employee> getAllEmp() {
        return Arrays.asList(
                new Employee(1,"ganesh",60000,"java",32),
                new Employee(5,"aish",35000,".net",31),
                new Employee(3,"priya",13000,"php",20) ,
                new Employee(6,"arun",90000,"aws",34) ,
                new Employee(2,"yogi",50000,"ML",36),
                new Employee(4,"rema",12000,"DA",25)
        );
    }

}
