// class uses2 {
//     uses2(){
//         System.out.println(" no argument constructor");
//     }
//     uses2(int a){
//         System.out.println("parametrised constructor");
//     }
// }
// public class thisof{
//     public static void main(String[] args) {
//         uses2 u=new uses2();
        
//     }
    
// }



//this() can be used to invoke current class cunstructor

//class uses2 {
//     uses2(){
//         System.out.println(" no argument constructor");
//     }
//     uses2(int a){
//         this();       //call uses2 first constructor
//         System.out.println("parametrised constructor");
//     }
//}
//public class thisof{
//     public static void main(String[] args) {
//         uses2 u=new uses2(10);
        
//     }
    
// }




// class uses2 {
//     uses2(){
//         this(10);//call uses2 first constructor
        
//         System.out.println(" no argument constructor");
//     }
//     uses2(int a){
//         //this();                //call uses2 first constructor
//         System.out.println("parametrised constructor");
//     }
// }
// public class thisof{
//     public static void main(String[] args) {
//         uses2 u=new uses2();
        
//     }
    
// }