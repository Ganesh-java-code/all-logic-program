package in.ganesh.methodreferance.methodrefwithstatic;

import in.ganesh.methodreferance.methodrefwithoutstatic.IMethodRef;

public class MethodRefWithStaticExample {

    public static void main(String[] args) {

        // Approach 1
        // static method referance
        IMethodRef ref = MethodRefWithStaticExample::doAdd;
        int add = ref.Add(10, 10);
        System.out.println(add);



    }
    public static int doAdd(int a,int b){
            return a+b;
        }

}
