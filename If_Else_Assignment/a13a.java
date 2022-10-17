
import java.util.Scanner;
public class a13a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your marital status: ");
        char m=sc.next().charAt(0);
        System.out.println("Enter your sex:");
        char s=sc.next().charAt(0);


        if(s=='f'||s=='F'){
            System.out.println("Employee is female and she will work only in urban areas!");
        }
        else if((s=='m'||s=='M') && (age<=40 &&age>=20)){
            System.out.println("he may work anywhere!");
        }
        else if((s=='m'||s=='M') && (age<=60 &&age>=40)){
            System.out.println("he will work in urban areas!");
        }
        else{
            System.out.println("ERROR");
        }

    }
}
