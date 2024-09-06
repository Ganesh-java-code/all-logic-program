package in.ganesh.methodreferance;

import in.ganesh.methodreferance.methodrefwithoutstatic.IMethodRef;
import io.micrometer.observation.Observation;

import java.util.ArrayList;
import java.util.function.*;

public class ArrListArbitoryExample{

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        BiConsumer<ArrayList<Integer>, Integer> biConsumer = ArrayList :: add;
        biConsumer.accept(arrayList,10);
        System.out.println(arrayList);

        BiFunction<ArrayList<Integer>,Integer,Boolean> biFunction = ArrayList::add;
        Boolean isAdded = biFunction.apply(arrayList, 20);
        System.out.println(isAdded);
        System.out.println(arrayList);

        Supplier<ArrListArbitoryExample>  supplier = ArrListArbitoryExample :: new;
        ArrListArbitoryExample arrListArbitoryExample = supplier.get();
        BiFunction<Integer,Integer,Integer> sumDigit = arrListArbitoryExample :: sumDigit;
        Integer integer = sumDigit.apply(10, 10);
        System.out.println(integer);

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };

        Function<String,String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return null;
            }
        };

        Predicate<Boolean> test = new Predicate<Boolean>() {
            @Override
            public boolean test(Boolean b) {
                return false;
            }
        };


        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return null;
            }
        };

        BiConsumer biConsumer1 = new BiConsumer() {
            @Override
            public void accept(Object o, Object o2) {

            }
        };

        BiFunction biFunction1 = new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return null;
            }
        };



    }
    int sumDigit(int a,int b){
        return a+b;
    }

}
