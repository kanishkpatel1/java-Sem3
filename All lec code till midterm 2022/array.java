import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array!");
        int a=sc.nextInt();
        int [] marks=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the value of marks"+(i+1));
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            System.out.printf(marks[i]+" ");
        }
    }
    
}
