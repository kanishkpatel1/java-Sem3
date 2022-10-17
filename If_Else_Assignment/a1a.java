
import java.util.*;
public class a1a{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      System.out.println("Enter the length");
      int l=sc.nextInt();
      System.out.println("Enter the breadth");
      int b=sc.nextInt();

      if(l==b){
        System.out.println("It is square");
      }
      else
      System.out.println("It is not square");
    }
}