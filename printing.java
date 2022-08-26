import java.util.Scanner;
public class printing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        int c=a+b;
        System.out.printf("sum of %d and %d is %d",a,b,c);
        System.out.println();
        System.out.println("Please enter your name");
        String str=sc.next();
        // System.out.println(str);
        // System.out.println("please enter something about yourself");
        String stra=sc.nextLine();
        
        System.out.println(stra);

    }
    
}

