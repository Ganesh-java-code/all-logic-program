package in.ganesh.stringexamples;

public class StringCharAtExample02 {
    public static void main(String[] args) {

//        String name = new String("ganesh patil");
//        char c = name.charAt(7);
//        System.out.println(c);

        String name = new String("ganesh patil");
        char c = 0;
        for(int i=0;i<name.length();i++){
            c = name.toUpperCase().charAt(i);
            System.out.println(c);
        }






    }
}
