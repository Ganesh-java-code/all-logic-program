package in.ganesh.stringexamples;

public class StringEqualIgnoreCaseExample06 {
    public static void main(String[] args) {

        String name = new String("ganesh patil");

        String name1 = new String("GanEsh PATIL");

        boolean value = name.equalsIgnoreCase(name1);

        System.out.println(value);




    }
}
