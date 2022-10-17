
// Final Keyword In Java .It is three types
// 1.Final variable
// 2.Final method
// 3.Final class


//The final keyword in java is used to restrict the user. The java final keyword can be used in many context.


// If you make any variable as final, you cannot change the value of final variable(It will be constant)

public class final_variable {
    final int speed=200;

    void run(){
        speed=200;   // if we execute this line we'll get compile  time error 
        System.out.println(speed);
    }
    public static void main(String[] args) {
        final_variable k=new final_variable();
        k.run();
    }
}
