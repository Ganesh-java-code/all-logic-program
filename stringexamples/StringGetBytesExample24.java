package in.ganesh.stringexamples;

import java.util.Arrays;

public class StringGetBytesExample24 {
    public static void main(String[] args) {

        String name = "ganesh patil";
        byte[] byteArray = name.getBytes();
        System.out.println(Arrays.toString(byteArray));

    }
}
