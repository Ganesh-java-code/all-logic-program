package in.ganesh.stringexamples;

public class StringIndexOfExample15 {
    public static void main(String[] args) {

       //  1. int indexOf(int ch)
        String str = "Hello, world!";
        int index1 = str.indexOf('o');  // Returns 4 (first occurrence of 'o')
        System.out.println(index1);

       // 2. int indexOf(String str)
        String sentence1 = "Java is fun. Java is powerful.";
        int index2 = sentence1.indexOf("Java");  // Returns 0 (first occurrence of "Java")
        System.out.println(index2);

        // 3. int indexOf(int ch, int fromIndex)
        String welcome = "Hello, world!";
        int index3 = welcome.indexOf('o', 5);  // Returns 8 (first occurrence of 'o' after index 5)
        System.out.println(index3);

        // 4. int indexOf(String str, int fromIndex)
        String sentence2 = "Java is fun. Java is powerful.";
        int index4 = sentence2.indexOf("Java", 10);  // Returns 14 (first occurrence of "Java" after index 10)
        System.out.println(index4);

//        String name = new String("ganesh patil");
//        int i = name.indexOf("e");
//        System.out.println(i);


    }
}
