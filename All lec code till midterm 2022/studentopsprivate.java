class Student{
private String name;
int age;
int roll;
static String University;
public void setName(String N){
    this.name=N;
}
public String getName(){
    return name;
}
static String function(){
    return University;
    }
String function2(String un){
        University=un;
        name=un;
        return name;
        }
}
public class studentopsprivate {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.setName("kanishk@patel");
        System.out.println(s1.getName());
        s1.function2("kanisk from kannauj");
        System.out.println(s1.function());
    }
}
