
//If you make any class as final, you cannot extend it.
final class c1{
    void m1(){
        System.out.println("This is final class: ");
    }
}
class c2 extends c1{   //can't inherit final class 
    void m2(){
        System.out.println("This is extended class: ");
    }
}

public class final_class {
    public static void main(String[] args) {
        c1 obj=new c1();
        obj.m1();
    }
}

// output--->final_class.java:8: error: cannot inherit from final c1
