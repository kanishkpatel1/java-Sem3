/*1=super refers to the immediate parent class instance variable
 * 2=super keyword can be used to invoke immediate parent class method.
 * 3=super() can be used to invoke immediate parent class constructor
 * 
 * 
 * //super vs super()
   */


//   class Uses {
//    int i=10;

// }
// class Bus extends Uses{
//    int i=20;
//    void show(int i){
//        System.out.println(i);//30
//        System.out.println(this.i);//20
//        System.out.println(super.i);//10


//    }
//    public static void main(String[] args) {
//        Bus ob=new Bus();
//        ob.show(30);
//    }
// }



//2

// class Uses {
//    void m1(){
//       System.out.println("I am in a class");// that line print
//    }

// }
// class Bus extends Uses{
   
   
//    void show(){
//        super.m1();

//    }
//    public static void main(String[] args) {
//        Bus ob=new Bus();
//        ob.show();
//    }
// }




class scla{
   void m1(){
      System.out.println("I am in a class");
   }

}
class Bus extends scla{
   void m1(){//method overriding
      System.out.println("i am class Bus");//
   }
   
   void show(){
       super.m1();     //call parent (Uses) class method m1 
       m1();     //call Bus class method

   }
}
   public class Uses{
   public static void main(String[] args) {
       Bus ob=new Bus();
       ob.show();
   }
}



//3

// public class Uses {
//    Uses(){
//       System.out.println("I am in a class");
//    }

// }
// class Bus extends Uses{
//    Bus(){
//       super();
//       System.out.println("i am class Bus");//
//    }

//    public static void main(String[] args) {
//        Bus ob=new Bus();
       
//    }
// }
