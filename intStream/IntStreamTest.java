package in.ganesh.intStream;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamTest {
    public static void main(String[] args) {

//        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int sum = intStream.sum();
//        System.out.println(sum);
//
//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int sum1 = integerStream.mapToInt(Integer :: intValue).sum();
//        System.out.println(sum1);

       /* Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).peek(no->no.intValue());

        Optional<Integer> result = integerStream.peek(no-> System.out.println("peek value :: "+no))
                .reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer1, Integer integer2) {
                System.out.println("int1 :: "+integer1+" int2 :: "+integer2+ " = "+(integer1+integer2));
                return integer1 + integer2;
            }
        });

        if( result.isPresent() ){
            System.out.println(result.get());
        }*/



/*
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> reduce = integerStream.reduce((integer1,integer2)->(integer1+integer2));

        if( reduce.isPresent() ){
            System.out.println(reduce.get());
        }
*/

        /*Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> reduce = integerStream.reduce(Integer :: sum);

        if( reduce.isPresent() ){
            System.out.println(reduce.get());
        }*/

       /* Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        char[] charArray = integerStream.reduce(0, Integer :: sum).toString().toCharArray();

        for(char c:charArray){
            System.out.println(c);
        }*/



        /*
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> integerStream = intStream.boxed().map(Object :: hashCode);

        integerStream.forEach(System.out::println);
*/

        /*IntStream intStream = IntStream.rangeClosed(0, 10);
        Stream<Integer> integerStream = intStream.boxed().map(Object :: hashCode);
        integerStream.forEach(System.out::println);

        List<Integer> collected = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
        System.out.println(collected);

        Integer[] integersArr = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> stream = Arrays.stream(integersArr);
        int sum = stream.mapToInt(Integer :: intValue).sum();
        System.out.println(sum);

        int[] intArr = new int[]{1,2,3,4,5,6,7,8,9,10};
        IntStream stream1 = Arrays.stream(intArr);
        int sum1 = stream1.sum();
        System.out.println(sum1);*/


// reduce() method
// 1,2,3,4,5,6,7,8,9,10
// 3,3,4,5,6,7,8,9,10
// 6,4,5,6,7,8,9,10
// 10,5,6,7,8,9,10
// 15,6,7,8,9,10
// 21,7,8,9,10
// 28,8,9,10
// 36,9,10
// 45,10
// 55

//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Integer reduce = integerStream.reduce(0, (a, b) -> a * b);
//        System.out.println(reduce);



    }
}
