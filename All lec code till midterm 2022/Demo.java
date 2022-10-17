/*static keyword is not acessed modifire
 * used-variable
 *      method
 *      block
 *      inner class(nested class)
 *      
 */

//1=Static variable
//static variable accessed from class but simple variable not acessed with class name we would have to create object:

class Student{
     static String name="dheeraj";
}
    public class Demo{
     public static void main(String[] args) {
      System.out.println(Student.name);
     }
   }

     
      