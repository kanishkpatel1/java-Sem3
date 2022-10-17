import java.util.Scanner;
class Student{
   String name;
   int age;
   int rollno;
}
public class student {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.name="kanisk";
        s2=s1; 
        s1.age=12;
        s1.rollno=2115000505;
        s2.name="hello";
        System.out.println("name"+s1.name);
        System.out.println("name"+s2.name);


        



    }
    
}
