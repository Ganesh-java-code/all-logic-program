package in.ganesh.stringexamples;

public class StringLastIndexOfExample16 {

    public static void main(String[] args) {

        // 1. int lastIndexOf(int ch)
        String str = "Hello, world!";
        int index = str.lastIndexOf('o');  // Returns 8 (last occurrence of 'o')
        System.out.println(index);

        // 2. int lastIndexOf(String str)
        String sentence1 = "Java is fun. Java is powerful. Java is popular.";
        int length = sentence1.length();
        System.out.println(length);
        int index1 = sentence1.lastIndexOf("Java");  // Returns 31 (last occurrence of "Java")
        System.out.println(index1);


        // 3. int lastIndexOf(int ch, int fromIndex)
        String str2 = "Hello, world!";
        int index2 = str2.lastIndexOf('o', 7);  // Returns 4 (last occurrence of 'o' before index 7)
        System.out.println(index2);

        // 4. int lastIndexOf(String str, int fromIndex)
        String sentence2 = "Java is fun. Java is powerful. Java is popular.";
        int index3 = sentence2.lastIndexOf("Java", 25);  // Returns 13 (last occurrence of "Java" before index 25)
        System.out.println(index3);

    }
}
