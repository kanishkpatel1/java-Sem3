/*static method belong to class not object
 * static method can be called directly by class names follow=  Classname.methodName()
 *used memory management
 
 */



// public class StaticMethod {
//     void display(){
//         System.out.println("1");

//     }
//     public static void main(String[] args) {
//         StaticMethod t=new StaticMethod();
//         t.display();
//     }
    
// }

//if used static method

// public class StaticMethod {
//   static  void display(){
//         System.out.println("1");

//     }
//     public static void main(String[] args) {
//        // StaticMethod t=new StaticMethod();//call directly or class neme through not need of object
//         display();
//         StaticMethod.display();
//     }
    
// }




// public class StaticMethod {
//     static void display(){
//         System.out.println("1");

//     }
//     public static void main(String[] args) {
        
//         display();
//        // show();//get error directly show only within the class
//        xyz.show();
//     }
    
// }
// class xyz{
//     static void show(){
//         System.out.println("2");
//     }
// }



/* static method can access only static data not instance data */

// public class StaticMethod {
//     int i=10;
//    static void display(){
//         System.out.println(i);

//     }
    
// }


//static method can not be used this and super keyword