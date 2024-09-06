package in.ganesh.methodreferance.arbitory;

public class MethodRefArbitoryObjExample {

    public static void main(String[] args) {


      IMethodRef1 iMethodRef =MethodRefArbitoryObjExample::doAdd;
        int add = iMethodRef.Add(new MethodRefArbitoryObjExample(),10, 10);
        System.out.println(add);


    }

    public int doAdd(int a,int b){
        return a+b;
    }

}
