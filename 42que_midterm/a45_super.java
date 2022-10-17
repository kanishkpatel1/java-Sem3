// part 1 with super variable

// class Vehicle{
//     int Speed=120;
// }
// class car extends Vehicle{
//     int speed=180;
//     void m1(){
//         System.out.println(super.Speed);   //because of super keyword speed is 120;
//     }
// }

// public class a45_super {
//     public static void main(String[] args) {
        
    
//     car obj=new car();
//     obj.m1();
//     }
// } 

//outut of the above code is --> 120 


//part 2 super method()
// class Vehicle{
//     void m1(){
//         System.out.println("parent method: ");
//     }
// }
// class a1 extends Vehicle{
//     void m1(){
//         System.out.println("a1 method");
        
//     }
//     void m2(){
//         super.m1();  // this  will call parent class method 
//         m1();   // this will call child class method  
//     }
    
// }
// public class a45_super {
//         public static void main(String[] args) {
            
        
//         a1 obj=new a1();
//         obj.m2();
//         }
//     } 

    //output--> parent method: 
//              a1 method



//type 3 super() with class;
class Person{
    Person(){
        System.out.println("Person constructor: ");

    }
  
}

class Kanishk extends Person{
    Kanishk ()
    {
        super();    //this super keyword will call person constructor
        System.out.println("Kanishk Constructor: ");
    }


}
public class a45_super {
            public static void main(String[] args) {
                
            
        Kanishk obj=new Kanishk();
                
          
            }
        } 