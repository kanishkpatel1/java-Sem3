import java.net.SocketTimeoutException;
//this function gives the odd number from 1 to n
import java.util.*;
public class nodd {
    public static void oddn(int n){
        for(int i=0;i<=n;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of n:");
     int n=sc.nextInt();
     oddn(n);
      }
    }
