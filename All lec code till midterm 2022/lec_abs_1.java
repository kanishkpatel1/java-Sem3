abstract class Hello {
    void m1() {
        System.out.println("hhhhhhhhh");
    } // partially defined method is abstract method.
    void m2() {
        System.out.println("hisdkdjflkjdsfklj");
    }
    
}
public class lec_abs_1 extends Hello {
    public static void main(String[] args) {
        lec_abs_1 t = new lec_abs_1();
        t.m2();
        t.m1();

    }
}
