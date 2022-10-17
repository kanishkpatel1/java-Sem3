// If you make any method as final, you cannot override it


class Bike{
    final void run(){
        System.out.println("this is final void method  and bike run on two wheels");
    }

}
class Car extends Bike{
    void run(){                            //  we will get compile time error because we can't override method final 
        System.out.println("it run's on four wheel: ");
    }
}
public class final_method {
    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.run();
        
    }
}
// we will get compile time error because we can't override method final 
// o/p-->    overridden method is final



//final method is inherited but you cannot override it. For Example:
// class Bike{  
//     final void run(){System.out.println("running...");}  
//   }  
//   class final_method extends Bike{  
//      public static void main(String args[]){  
//       new final_method().run();  
//      }  
//   } 

  //o/p is --> running...