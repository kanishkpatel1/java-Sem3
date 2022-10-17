import java.util.*;

public class int_to_other {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number in integer");
    int n=sc.nextInt();
    System.out.println("number in binary is "+Integer.toBinaryString(n));
System.out.println("number in hexa is="+Integer.toHexString(n));
System.out.println("number in octal is="+Integer.toOctalString(n));
}  
}
