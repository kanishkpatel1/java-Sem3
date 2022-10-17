
import java.util.Scanner;
public class a12a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check :");
        int n=sc.nextInt();
        if(n%4==0||n%400==0){
            System.out.println("Entered year is leap year:");
        }
        else if(n%100!=0){
            System.out.println("Entered year is not leap year:");
        }
        else{
            System.out.println("Entered year is not leap year:");
        }
    }
}
