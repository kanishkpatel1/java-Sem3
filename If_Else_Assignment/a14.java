import java.util.Scanner;
public class a14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number! ");
        int n=sc.nextInt();
       
     int res=0;
int rev;
while(n!=0){
    rev=n%10;
    res=res*10;
    res+=rev;

    n=n/10;
}
System.out.println(res);
}
}
