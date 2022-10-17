class Student{
    String name;
    int age;
    int rollno;
public void printInfo(){
System.out.println(this.name);
System.out.println(this.age);
System.out.println(this.rollno);

}
Student(String name,int age){
    this.name=name;
    this.age=age;
}
}

public class am2java {
    public static void main(String[] args) {
        Student s1=new Student("kanishk",26);
        Student s2=new Student("ritik",18);
 s1.printInfo();
 s2.printInfo();
    }
}
