import java.util.Arrays;

public class multiple_main_method {
    public static void main(String[] args) {   //we can't call this main method from another method
       System.out.println("this is main method: "); 
       int []a={1,2,4,3};
       main(a);

       String [] str={"kanishk","patel","jkljjlkjlj"};
         //main(str); this is passed to the main method and it will run infinite times
       }
    
    public static void main(int ...a){     //this is varArgs 
        System.out.println("and this is a varArgs method");
        System.out.println(Arrays.toString(a));
            main("kanishk and this is main string method: "); //callind below main method
    }


    public static void main(String str) {
        System.out.println(str);
        
    }
    // public static void main(String[] ...arr){      //for string array //because of this it will be a infinite loop because main method is in string[] array 

    //     System.out.println(Arrays.toString(arr));
    // }


}
