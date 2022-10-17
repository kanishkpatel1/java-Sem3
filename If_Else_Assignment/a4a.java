
import java.util.*;
public class a4a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your service year:");
        int ser=sc.nextInt();
        System.out.println("Enter your salary:");
        int sal=sc.nextInt();
        if(ser>=5){
            sal+=sal*0.5;
        }
        System.out.println("total salary of the employee is: "+sal);
    }
}
