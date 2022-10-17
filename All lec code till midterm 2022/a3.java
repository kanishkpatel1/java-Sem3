import java.util.Arrays;

// we can create multiple main method but the prameter data type should be different

public class a3 { 
   public static void main(String[] args) { 
       System.out.println("hii");
       main();  //whereargs
main(2);    //integer wala method
main(1,2,3);   //whereArgs 
}


    //ex  of 
//    public static void main(String ...s){               // and string [] can't method cant be in a class 
//    System.out.println("kanishk");
//    main(23);  // calling of main int method 
//        }
  
public static void main(int a) {
    System.out.println(a);
}
// public static void main(int [] args) { 
   
// }
public static void main(int ...a) {
System.out.println(Arrays.toString(a));
    
}
}
