package in.ganesh.methodreferance.methodrefwithoutstatic;

public class MethodRefWithoutStaticExample {
    public static void main(String[] args) {

        // Approach 2
        // non static method referance

       // MethodRefWithoutStaticExample test = new MethodRefWithoutStaticExample();
        IMethodRef ref = new MethodRefWithoutStaticExample()::doAdd;
        int add = ref.Add(10, 10);
        System.out.println(add);



    }
    public int doAdd(int a,int b){
        return a+b;
    }
}
