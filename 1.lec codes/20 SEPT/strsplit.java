
import java.util.Arrays;
import java.util.Scanner;
public class strsplit {
    public static void main(String[] args) {
        String str="kanishk patel";
        String ch[]=new String [str.length()];
        //ch=str.split("");
        ch=str.split("",4);   // 4 parts we get
        System.out.println(Arrays.toString(ch));

        Scanner sc=new Scanner(System.in);
        String []arr=sc.nextLine().split(" ");
        System.out.println(Arrays.toString(arr));


        String []ars="kanihsk jsdfk skf".split("");   // split 
        System.out.println(Arrays.toString(ars));
    }
}
