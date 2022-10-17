public class a1{
    public static void main(String[] args) {
        String s1=new String("this is a string sjfdkljdfsklj");
        String s2=new String("this is a string sjfdkljdfsklj");
        System.out.println(s1==s2);     //output is false because reference is not same
    String s3="this is a string sjfdkljdfsklj";
    System.out.println(s1==s3);         //false
    String s4="this is a string sjfdkljdfsklj";
    System.out.println(s4==s3);         //true
    String s5="this is a string"+" sjfdkljdfsklj";
   
    System.out.println(s4==s5);           //true

    String s6="this is a string";
    String s7=s6+" sjfdkljdfsklj";   //It is created in heap memory
    System.out.println(s7==s4);           //false


    final String s8="this is a string";   //s8 is constant it's value will never change
    String s9=s8+" sjfdkljdfsklj";   
    System.out.println(s9==s4);           //true
    }
}