import java.util.Arrays;

class Employee{
String name;
int age;
void Employee(){
this.name=name;
this.age=age;

}

}
class Testa{
public static void main(String[] args){
//int[] marks=new int[10];
//marks[0]=12;


//int[][] a=new int[4][];
//a[0]=new int[2];
//a[1]=new int[3];
//a[1][1]=10;
//a[3]=a[2];
//a[2][1]=12;



Employee[] e=new Employee[5];
e[0]=new Employee();
e[1]=new Employee();
e[2]=new Employee();
e[3]=new Employee();
e[4]=new Employee();

//e[0].name="kanishk";
//e[0].age=32;

//e[1].name="nhk";
//e[1].age=320;


//e[2].name="patel";
e[2].age=322;
System.out.println("name="+e[0].name+" "+e[0].age);
System.out.println("name="+e[2].name+" "+e[2].age);
System.out.println("name="+e[1].name+" "+e[1].age);



//System.out.println(Arrays.toString(a[2][1]));
System.out.println(Arrays.toString(e));

//for(Employee E:e){
//System.out.println(E.name+E.age); }

}
}
