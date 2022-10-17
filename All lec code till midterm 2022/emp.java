import java.util.*;
class Employee{
    String name;
    double salary;
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    } }
public class emp {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    //  Employee[] arr=new Employee[10];   
     Employee e1=new Employee("divyanshu", 10000);
     Employee e2=new Employee("kanishk", 1000022);
     Employee e3=new Employee("ritik", 100002);
     Employee e4=new Employee("rahul", 10033);
     Employee e5=new Employee("shivam", 10055);
     Employee e6=new Employee("sanskar", 100012);
     Employee e7=new Employee("dev", 100120);
     Employee e8=new Employee("dhruv", 100112);
     Employee e9=new Employee("ram", 20000);
     Employee e10=new Employee("kartik",300000);
Employee[] arr=new Employee[10];
arr[0]=e1;
arr[1]=e2;
arr[2]=e3;
arr[3]=e4;
arr[4]=e5;
arr[5]=e6;
arr[6]=e7;
arr[7]=e8;
arr[8]=e9;
arr[9]=e10;

double ans=0;
int index=-1,i=0;
String name="";
while(i<arr.length){
    if(arr[i].salary>ans){
        ans=arr[i].salary;
        index=i;
        name=arr[i].name;  }
    i++; }
System.out.println(name +" has maximum salary"+ans);
}  
}
