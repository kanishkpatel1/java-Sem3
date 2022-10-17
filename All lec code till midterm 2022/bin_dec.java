
import java.util.Scanner;
public class bin_dec {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the binary number:");
    int bin=sc.nextInt();
    int rem=0,dec=0,j=1;
    String s=String.valueOf(bin);
    for (int i=s.length();i>0;i++){
        rem=bin%10;
        dec+=rem*j;
        j*=2;
        bin/=10;
     }
    System.out.println("Number in decimal is "+dec);
}
}
