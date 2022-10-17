import java.util.Scanner;
import java.util.Arrays;

public class userd_input_intarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer number separate with space: ");
        String[] string=sc.nextLine().split(" ");
        double []num=new double[string.length];
        for(int i=0;i<string.length;i++){
num [i]=Double.parseDouble(string[i]);
        }
System.out.println(Arrays.toString(num));

    }
}
