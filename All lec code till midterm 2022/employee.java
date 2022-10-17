/*when a variable is declared as static, then a single copy of variable is created nd shared among all 
 * object at class level. thus company name i.e SP will share among e1,e2 and all the objects.
 * 
 * static variable create for memory efficient 
 * the static variable can be used to refer to the common property or value for all objects,
 */



//  class employee {
//     int empid;
//     String name;
//     String company ;
//     employee(int empid,String name,String company){//make constructor
//         this.empid=empid;
//         this.name=name;
//         this.company=company;
//     }
//     void display(){
//         System.out.println(empid+" "+name+" "+company);
//     }
//     public static void main(String[] args) {
//         employee e1=new employee(101,"Amit","Smart programming");
//         e1.display();

//         employee e2=new employee(102,"aman","Smart programming");

//         e2.display();
//     }
    
// }





class employee {
    int empid;
    String name;
  static  String company="Smart programming" ;
    employee(int empid,String name){//make constructor
        this.empid=empid;
        this.name=name;
        //this.company=company;
    }
    void display(){
        System.out.println(empid+" "+name+" "+company);
    }
    public static void main(String[] args) {
        employee e1=new employee(101,"Amit");
        e1.display();

        employee e2=new employee(102,"aman");

        e2.display();
    }
    
}
