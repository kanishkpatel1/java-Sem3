import java.util.Scanner;
public class a3a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quantity:");
        int q=sc.nextInt();
        double rate=q*100;
        if(rate>1000){

            rate=rate-rate*0.1;
        }
        System.out.println("final price is :"+rate);
    }
}
