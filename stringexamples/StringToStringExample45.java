package in.ganesh.stringexamples;

class Person{

    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "rollNo=" + rollNo + ", name='" + name + '\'' + '}';
    }
}

public class StringToStringExample45 {
    public static void main(String[] args) {

        Person person = new Person();
        person.setRollNo(1001);
        person.setName("ganesh");
        System.out.println(person);

    }
}
