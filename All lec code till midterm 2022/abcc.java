class Employee{
    String name;
    int age;
    Employee head;

}
public class abcc {
    public static void main(String[] args) {
        
        Employee e=new Employee();
        Employee e1=new Employee();
        e.head =e1;   //e.head is a object similiar to e1
        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.head.name);
        System.out.println(e.head.age);
    }
}
