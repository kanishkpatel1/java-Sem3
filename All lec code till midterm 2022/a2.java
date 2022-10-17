interface Hello{
default void m1(){    // by default it is abstract
    System.out.println("hello");
    m2();  // access of private method 
    }
    private void m2(){
        System.out.println("private method: ");
    }
}

public class a2  implements Hello {
    public static void main(String[] args) {
        a2 obj=new a2();
        obj.m1();
    }
}
