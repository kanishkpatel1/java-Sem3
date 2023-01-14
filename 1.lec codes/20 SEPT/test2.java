public class test2 {
    String name;
    static String college;
    void m1(){
        college="gla";
    }
    //we can call static method in instance method
 static void m2(){
       // m1();//error we cant call non static method in static method
       test2 t=new test2();
       t.m1();   //now it will execute
    }
    public static void main(String[] args) {
        
    }
}
