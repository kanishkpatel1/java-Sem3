import java.util.Scanner;
public class check_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check ");
        boolean a=sc.hasNextInt();  //hasNextInt to check weather the number is integer or not
        System.out.println(a);
        
    }
}
