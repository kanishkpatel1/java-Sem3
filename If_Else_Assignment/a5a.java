import java.util.Scanner;
public class a5a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks=sc.nextInt();
        if(marks>=80){
            System.out.println("Grade is A ");

        }
        else if(marks>=60 && marks<80){
            System.out.println( "Grade is B");
        }
        else if(marks>=50 && marks<60){
            System.out.println( "Grade is C");
        }
        else if(marks>=45 && marks<50){
            System.out.println( "Grade is D");
        }
        else if(marks>=25 && marks<45){
            System.out.println( "Grade is E");
        }
        else
        System.out.println("Grade is F");
        

    }
    
}
