import java.util.*;
public class body_mass_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        int b=sc.nextInt();
        System.out.println("Enter your heightin inches: ");
        int i=sc.nextInt();
        double bmi=b*0.45359237/(i*0.0254*i*0.0254);
        System.out.println("Body mass index is "+bmi);

    }
    
}
