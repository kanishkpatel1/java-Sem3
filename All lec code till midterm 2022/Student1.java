
class Student{
	private String name;  			//we cant change it outside from class
	int age;   					//instance variable
	int roll;
	static double rate;
	public void setName(String name){
	this.name=name;	

}
public String getName(){
return name;
}

}
public class Student1{
public static void main(String [] args){
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
//s1.name="kanishk";
s1.setName("kanishk");


s1.age=12;
s1.roll=2115000505;
System.out.println(s1.rate);
//s1.rate=7.8;                    		//we can change any static variable with any object 
//System.out.println(s2.rate);
//Student.rate=10;            
//System.out.println(Student.rate);

//System.out.println(s1.name+" "+s1.age+" "+ s1.roll);


System.out.println(s1.getName());

}
}  