//command line arguments-------------
//-------------------------------------------------------@royal_kanishk_patel

public class a2 {
    
        public static void main(String[] args) {
            System.out.println("Number of Command Line Argument = "+args.length);
            
            for(int i=0; i< args.length; i++) {
                System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
            }
        }
        //run this program without using code runner extension ---->  javac a2.java 
        //  then-->   java a2 hello kanishk 
        //-----> then we will get--> hello     kanishk
    
    }

