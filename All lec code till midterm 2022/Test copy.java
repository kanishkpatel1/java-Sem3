// abstract class A{
//     abstract void main();
// }
// abstract class B extends A{
//     abstract void m2();
// }

// public class Test{

//     public static void main(String[] args) {
    
//     }
// }


abstract class A{
    abstract void main();
}
abstract class B extends A{
    abstract void m2();
}
//  class Test extends B{          // error we  want to extends abstract class in non abstract class
abstract class Test extends B{

    void m2(){

    }
    void m1(){

    }
    public static void main(String[] args) {
        
    }
}