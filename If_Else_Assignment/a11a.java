import java.util.Scanner;
public class a11a {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the character you want to check :");
         char ch=sc.next().charAt(0);
         if(ch>='a'&&ch<='z'){
            System.out.println("Enter character is lowercase:");
         }
         else if(ch>='A'&&ch<='Z'){
            System.out.println("Entered character is uppercase: ");
         }
         else{
            System.out.println("Invalid character");
         }
        }
    }
