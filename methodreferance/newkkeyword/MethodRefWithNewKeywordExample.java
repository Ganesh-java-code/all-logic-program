package in.ganesh.methodreferance.newkkeyword;

import java.util.function.*;

public class MethodRefWithNewKeywordExample {

    public static void main(String[] args) {

        Supplier<Employee> supplier = Employee::new;
        Employee employee = supplier.get();
        System.out.println(employee);

        BiFunction<Integer,String,Employee> biFunction = Employee::new;
        Employee ganesh = biFunction.apply(10, "ganesh");
        System.out.println(ganesh);


    }
}
