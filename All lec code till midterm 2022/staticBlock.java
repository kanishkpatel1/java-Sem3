/*static block executes automatically when the class is loaded in the memory */

//before 1.6 version  we can execute static block without main method
public class staticBlock {

    static{
        System.out.println("Hello");
    }
    public static void main(String[] args) {//required for main method first execute static block
        System.out.println("I am main method");
    }
    static{
        System.out.println("hi");
    }

    
}

//we can create multiple static block and execute top to buttom and first multiple static block execute and after
//main method


/*
 * uses:
 * 1=ststic block is execute at class loading, hence at the time of class loading if we want to perform any activity
 * we have to define that inside static block
 * 2=static block is used to initialize the static members
 */

