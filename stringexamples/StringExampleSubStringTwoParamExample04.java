package in.ganesh.stringexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringExampleSubStringTwoParamExample04 {

    public static void main(String[] args) {

        String name = new String("ganesh patil aish");

        List<String> stringList = Arrays.asList(name.split(" "));

        // String substring = name.substring(0, 1);

        List<String> stringList1 = stringList.stream().sorted(Comparator.comparing(name1 -> name1.substring(2, 3).toLowerCase())).collect(Collectors.toList());

        Collections.reverse(stringList1);

        String join = String.join(" ", stringList1);

        System.out.println(join);




    }

}
