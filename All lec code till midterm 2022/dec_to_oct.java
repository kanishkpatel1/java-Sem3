import java.util.*;
public class dec_to_oct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int d=sc.nextInt();
        int num[]= new int[100];
        int  quat=d,rem,i=1;

        while(quat!=0){
            num[i++]=quat%8;
            quat=quat/8;

        }
System.out.println("number in octal is");
for (int j=i-1;j>=1;j--){
    System.out.print(num[j]);

}
    }
}
