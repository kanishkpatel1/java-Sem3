class student{
    String name;
    int roll;
    static int age;
}

public class studentops {
    public static void main(String[] args) {
        
    
    student s1=new student();
    student s2=new student();
    student s3=new student();
    student.age=90; //because of age is static
    s1.name="kanishk";


    System.out.println(s1.name);
System.out.println(student.age);
    
    }
}
 
