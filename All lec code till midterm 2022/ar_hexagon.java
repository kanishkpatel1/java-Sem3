import java.util.*;
public class ar_hexagon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of side:");
        double s=sc.nextDouble();
double area=(6*s*s)/(4*Math.tan((Math.PI)/6));
System.out.println("Area of the hexagon is "+area);
    }
    
}
