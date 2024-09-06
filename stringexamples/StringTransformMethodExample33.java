package in.ganesh.stringexamples;

public class StringTransformMethodExample33 {
    public static void main(String[] args) {

        String name = "ganesh patil";
        String transform = name.transform(name1 -> name1 + " from solapur");
        System.out.println(transform);

    }
}