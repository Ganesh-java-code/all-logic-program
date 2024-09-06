package in.ganesh.methodreferance.practice;

import com.mysql.cj.callback.MysqlCallbackHandler;
import in.ganesh.methodreferance.newkkeyword.Employee;

import java.io.PrintStream;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UpperCaseImpl {
    public static void main(String[] args) {


    }

    public String toUpperCase(String name){
        return name.toUpperCase();
    }

    public static int add(int a,int b){
        return a+b;
    }

}
