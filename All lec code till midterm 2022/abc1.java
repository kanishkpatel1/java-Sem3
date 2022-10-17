//every method that is used in interface only abstract
//method of parent and child class should ve same  access modifier
// every method in the interface is public and private
// we can implements more than one interfaces in a class
// interface can extend more than one inteface at a time

// we cant make any method private, protected, final ,static, synchronized ,native, strictfp inside the interface
// interface hello{
//     void methodOne();
// }
// public class abc1 implements hello{
//     public void methodOne(){};
//     public static void main(String[] args) {
        
//     }
// }
interface hello{
     int x=10;    //by default it is a static and final
    static int y=10;
    final int z=10;

 void methodOne();

}
interface a1{
    void m1();
}

// public class abc1 implements hello,a1{    //we can  imlements more than one interface in the class 
    public class abc1 implements hello{ 
    public void methodOne(){};   //if we dont use public it will give error
    //public void m1(){};  //we can  imlements more than one interface in the class 
     public static void main(String[] args) {
        System.out.println(abc1.x);             //printing of static member
        System.out.println(abc1.y); 
        System.out.println(abc1.z);   
    }
}