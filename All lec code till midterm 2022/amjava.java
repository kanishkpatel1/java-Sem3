class Student{
    String name;
    int age;
    int rollno;
public void printInfo(){
System.out.println(this.name);
System.out.println(this.age);
System.out.println(this.rollno);
}
}

public class amjava {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        s1.name="kanishk";
        s1.age=23;
        s1.rollno=26;
        s1.printInfo();



        s2.name="ritik";
        s2.age=18;
        s2.rollno=22;
       s2.printInfo(); 

    }
}
