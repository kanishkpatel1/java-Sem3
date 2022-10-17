import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        int f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        while(n!=0){
f*=n;
n--;
        }
        System.out.println(f);
    }
}
