//method overloading   //polymorphism
import java.util.Arrays;
public class overloading {

static int [] add(int value, int[] arr1){
    int []arr2=new int [arr1.length+1];
    for(int i=0;i<arr1.length;i++){
        arr2[i]=arr1[i];
    }
arr2[arr1.length]=value;
return arr2;
}

static double [] add(double value, double[] arr1){
    double []arr2=new double [arr1.length+1];
    for(int i=0;i<arr1.length;i++){
        arr2[i]=arr1[i];
    }
arr2[arr1.length]=value;
return arr2;
}
public static void main(String[] args) {
   
    System.out.println("Enter the value :");
    int []arr1={1,2,3,4,5};
    System.out.println(Arrays.toString(add(2,arr1)));
    System.out.println(Arrays.toString(add(20.0,new double[]{1.2,2.2,3.5})));   
     //this aray that we are passing is annonymous array  we don't need to give length of the array
    
}
}
