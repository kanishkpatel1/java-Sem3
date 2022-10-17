//this keyword can be ussed to pass as an argument in the method call

// public class uses3 {
//     void m1(uses3 td){
//         System.out.println("i am m1");
//     }
//     void m2(){
//         m1(this);
//     }
//     public static void main(String[] args) {
//         uses3 u=new uses3();
//         u.m2();
//     }
// }


//this keyword can e used to pass as an argument in the constructor call


// public class uses3 {
//      uses3(Thisdemo td){
//         System.out.println("test class constructor");
//     }
// }
//  class Thisdemo{
//     void m1(){
//         uses3 u=new uses3(this);
//     }
//     public static void main(String[] args) {
//         Thisdemo t=new Thisdemo();
//         t.m1();
//     }
// }



//this keyword can be used to return the current class instance from the kewword
public class uses3{
    uses3 m1(){
        return this;
    }
    public static void main(String[] args) {
        uses3 t=new uses3();
        t.m1();
    }
}