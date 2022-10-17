class Student {
    String name;
    int age;
    int rollno;

 public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
 }
    
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;  
    }  
    Student() {
    }
}
 

public class am3java {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "kanishk";
        s1.age = 24;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}


