import java.util.Scanner;;
public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of subject 1");
        int a1=sc.nextInt();
        System.out.println("Enter the marks of subject 2");
        int a2=sc.nextInt();
        System.out.println("Enter the marks of subject 3");
        int a3=sc.nextInt();
        int c=(a1+a2+a3)/3;
        System.out.printf("percentage is %d",c);
        
    }
}
