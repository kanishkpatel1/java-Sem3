import java.util.Arrays;

class Employee{
String name;
int age;
Employee(String name,int age){
this.name=name;
this.age=age;

}

}
class Testa{
public static void main(String[] args){
Employee[] e=new Employee[5];
e[0]=new Employee("kanishk",45);
e[1]=new Employee("abc",12);
e[2]=new Employee("asdf",12);
e[3]=new Employee("abn",23);
e[4]=new Employee("sd",58);
}
}
