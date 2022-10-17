// It is also a run time polymorphism......>


//If subclass (child class) has the same method as declared in the 
//parent class, it is known as method overriding in Java.


//Rules for Java Method Overriding-->
// 1. The method must have the same name as in the parent class
// 2.The method must have the same parameter as in the parent class.
// 3.There must be an IS-A relationship (inheritance).


//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle{  
    //defining a method  
    void run(){System.out.println("Vehicle is running");}  
  }  
  //Creating a child class  
  class Bike2 extends Vehicle{  
    //defining the same method as in the parent class  
    void run(){System.out.println("Bike is running safely");}  
  }

public class Override{
    public static void main(String args[]){  
    Bike2 obj = new Bike2();//creating object  
    obj.run();//calling method  
    }  
  } 

  //output-->Bike is running safely