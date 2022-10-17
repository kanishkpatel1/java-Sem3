// incomplete\

import java.util.Scanner;
public class countn {
    public static int[] details(int n,int a,int b,int c){
        if(n<0){
            a++;
           
        }
        else if(n==0){
            b++;
           
        }
        else{
            c++;
            
        } 
        return new int[]{a,b,c};
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
System.out.println("Enter the total no of input's:");
            int n=sc.nextInt();
            for (int i=1;i<=n;i++){
                System.out.println("Enter the number: ");
                int num=sc.nextInt();
                int a=0,b=0,c=0;

            }


        }
}
