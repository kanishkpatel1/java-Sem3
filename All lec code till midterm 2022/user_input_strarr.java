import java.util.Arrays;
import java.util.Scanner;

public class user_input_strarr {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string separate with space:ex ...> as asdfa 123 1 ?? "); 
       String []arr=sc.nextLine().split(" ");
       System.out.println(Arrays.toString(arr));
    }
}
