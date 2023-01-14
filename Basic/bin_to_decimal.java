import java.util.*;

public class bin_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number for conversion");
        long n=sc.nextLong();
        int decimal =0;
        long remainder;
        int i=0;
        while(n!=0){
remainder=n%10;
decimal+=remainder*Math.pow(2,i);
i++;
n/=10;

        }
        System.out.println( "number in decimal is "+decimal);
    }
}
