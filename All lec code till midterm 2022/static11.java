
class Student{
    
String name;
static String school;    //we can access it by direct class name
}


public class static11 {
    public static void main(String[] args) {
        Student.school="GLA";   //it is same for all the students
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
s1.name="kanishk";
s2.name="tanishk";
s3.name="christofer";

        System.out.println(s1.name+"   in "+s1.school);
        System.out.println(s2.name+"   in "+s1.school);
        System.out.println(s3.name+"   in "+s1.school);
    }
    
}
