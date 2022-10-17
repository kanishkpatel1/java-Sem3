public class method_signature {
    public void m1(double d){ }
    public void m2(int i){}
    public static void main(String[] args) {
        method_signature t=new method_signature();
        t.m1(5);
        //t.m3(1);n  error because of mehtod 3 is not defined in the class
    }
}
