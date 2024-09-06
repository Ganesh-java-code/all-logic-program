package in.ganesh.methodreferance.uppercase;

public class UpperCaseTest {
    public static void main(String[] args) {

        IUpperCase upperCase = UpperCaseTest::UpperCase;
        String ganeshPatil = upperCase.toUpperCaseLetter(new UpperCaseTest(),"ganesh patil");
        System.out.println(ganeshPatil);
    }

    String UpperCase(String name){
        return name.toUpperCase();
    }

}
