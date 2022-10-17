    //compile time polymorphism
    //method overloading
    
    class Student{
    String name;
    int age;
    public  void printinfo(String s,int n){
        System.out.println("name is"+s);
        System.out.println("age is"+n);
    }

    public  void printinfo(String s){
        System.out.println("Name is "+s);
    }
    public  void printinfo(int a){
        System.out.println("age is"+a);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="kanishk";
        s1.age=12;
        s1.printinfo(s1.age);
        s1.printinfo(s1.name,s1.age);
        s1.printinfo(s1.age);
    }
}
