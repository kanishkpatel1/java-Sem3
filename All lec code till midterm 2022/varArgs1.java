

import java.util.Arrays;
public class varArgs1 {
    // static void varArgs(String name,int...x){  //for passing string with array

       // static void varArgs(int...x){    //for int array
        static void varArgs(int[]...x){   //for multiple array
   
   //int []y=x;
        // System.out.println("name: "+name);
        System.out.println(Arrays.toString(x));

       // System.out.println("array y: "+Arrays.toString(y));

        }
    public static void main(String[] args) {

        // varArgs("lamosjl");    //we would have to pass the name first  
        // varArgs("kanishk",1,2);  // pass the element
        // // varArgs(1,2,3,'A'); 
        // varArgs("kanishk",new int []{1,2,3,4,5});  //we can pass the array
        // varArgs("kanishk", 1,2,3,4);  //in it 1,2,3,4  is also an array
        //we cant convert int type array to double by type promtion rule

int [] a={12,22,35,23};
varArgs(a,a,new int [] {1,2,3,4});

    }
}
