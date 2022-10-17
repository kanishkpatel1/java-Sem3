
import java.util.*;
public class lec {
    //hour
    //rate
    //if(hour>8)-------50%rate

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hrs=sc.nextInt();
        int rate=sc.nextInt();
        double pay=0;
        if(hrs<=8){
            pay=hrs*rate;
        }
        if(hrs>8){

            pay=(hrs-8)*rate*1.5;
            pay+=8*rate;
        }
System.out.println("final payment is "+pay);
    }
}
