import java.util.Scanner;
public class enhanced {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String name=sc.next(); 
       switch(name){
        case "kanishk" ->System.out.println("your name is kanishk");
        case "deves" ->System.out.println("your name is devesh");
        case "royal" ->System.out.println("your name is royal");
        default -> System.out.println("your name is "+name);
       
    
    }
    }
}
