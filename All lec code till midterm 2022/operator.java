import java.util.*;

public class operator{
public static void main(String[] args){


String a="kanishk";
String b="Patel";
System.out.println(a+b);
//System.out.println(true>false); //compile time error
//System.out.println("kanishk"=="patel");  //no error  o/p=false
//System.out.println("kanishk">"patel");  //compile time error

Scanner sc=new Scanner(System.in);
// System.out.println("Enter string s0");

// String s0=sc.next();
// System.out.println("Enter string s3");
// String s3=sc.next();
// System.out.println(s0==s3); //false
// System.out.println(s0.equals(s3)); //true because it check value

// String s1="java";
// String s2="java";
// System.out.println(s1==s2); //true

// String s10=new String("java");
// String s20=new String("java");
// System.out.println(s10==s20); //false



//int x=a>b?a*2.0:a*3.0;  //error because of data  type
//int x=a>b&&a>c?a:b>c?b:c;  //find greater in 3
System.out.println();
//System.out.println(3&&0); //error compile time because it operates only in binary
System.out.println(3>1&3>2);  //true
System.out.println(true & false);  //false
System.out.println(true|| false);  //true

int l=sc.nextInt();
String s=(l%4==0 && l%100!=0) || l%400==0 ? "leap year":"not leap year";
System.out.println(s);


}
}
