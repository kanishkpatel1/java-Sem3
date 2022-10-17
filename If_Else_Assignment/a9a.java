
import java.util.Scanner;
public class a9a {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of class held : ");
   int a1=sc.nextInt();
   System.out.println("Enter the number of class attend : ");
   int a2=sc.nextInt();
   double a3=100*a2/a1;
   System.out.println("percentage of attendence is:"+a3); 
   System.out.println("you has medical cause:  ");
   char ch=sc.next().charAt(0);
if(a3>=75.0){
    System.out.println("yes he is allowed");
}
else if(ch=='y'||ch=='Y'){
    System.out.println("yes he is allowed");
}

else{
    System.out.println("he is not allowed");
}
}
}