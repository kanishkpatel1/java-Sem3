
import java.util.*;
public class sum_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int a=0;
        int b=n;
        while(n!=0){
            n=n/10;
            a++; }
            System.out.println(a);
        int suma=0;
        for (int i=0;i<a;i++){
            suma+=b%10;
            b=b/10;


        }
        System.out.println("Sum of its digit is "+suma);
    }
}
