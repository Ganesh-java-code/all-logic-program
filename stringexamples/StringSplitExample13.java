package in.ganesh.stringexamples;

public class StringSplitExample13 {

    public static void main(String[] args) {

        String name = new String("ganesh patil");

        System.out.println(name);

        String name1 = new String("ganesh patil");

        String[] split = name1.split(" ");

        for(int i=0;i<split.length;i++){
            System.out.println(split[i]);
        }

        String str1 = "apple,banana,orange";
        String[] split1 = str1.split(",",2);
        for(int i=0;i<split1.length;i++){
            System.out.print(" "+split1[i]);
        }

    }

}
