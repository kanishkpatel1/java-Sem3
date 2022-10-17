import java.util.Scanner;
public class unique{
public static boolean chq(String str){
    boolean ar[]=new boolean[256];
    for(int i=0;i<str.length();i++){
int c=str.charAt(i);
if(ar[c]==true){
    return false; }
ar[c]=true; }
return true;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(chq(str));
    }
}