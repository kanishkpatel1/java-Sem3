//constructor   -- it is used to initialize instance member

class Employee{
    int age;
    String name;
    double Salary;
Employee(int age){
this.age=age;
}  
Employee(double sal){    //when multiple constroctor created it is called constructor overloading
    this.Salary=sal;
    
    }
Employee(String n,int a,double sal){
    this.name=n;
    this.age=a;
    this.Salary=sal;

     
    }
void setDetail(String n,int a,double sal){   //we cant make static method where this keyword used
        this.name=n;
        this.age=a;
        this.Salary=sal;
    }
void getDetatil(){
        System.out.println("name: "+this.name+"  age: "+this.age+"  Salary: "+Salary);
    }
}
public class constrctr {
    public static void main(String[] args) {
        //Employee e1=new Employee();
        // when we make constructor the we have to give name age direct in () bracket
        Employee e=new Employee("kanishk", 23, 12.03);
        Employee e1=new Employee(12);
        Employee e2=new Employee(12.0);
        e.getDetatil();    //for constructor  Employee
        
        // e1.setDetail("kanishk", 12, 12.03);
        // e1.getDetatil();

    }
    
}
