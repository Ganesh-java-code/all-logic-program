package in.ganesh.model;

public class Employee{
    private int id;
    private String name;
    private int salary;
    private String designation;
    private Integer age;

    public Employee(int id, String name, int salary, String designation, Integer age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                '}';
    }
}