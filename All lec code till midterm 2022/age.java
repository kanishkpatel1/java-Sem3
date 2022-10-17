import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your age!");
        int age=sc.nextInt();
        if(age<=20){
            System.out.println("your age is below 20");

        }
        else if(age>=20){
            System.out.println("your age is above 20");

        }
        else if(age>80){
            System.out.println("your age is greater than 80");
        }
    }
    
}
