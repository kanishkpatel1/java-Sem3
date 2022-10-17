class data{
public static void main(String[] args){
byte a=1;
byte b=20;
//byte c=a+b;//error can't convert from int to byte
int c=a+b;
String s="kanisk";
int a1=10;
int b1=20;
System.out.println(a1+b1+s);  //30kanishk
System.out.println(s+a1+b1);  //kanishk1020

System.out.println(c);
}
}