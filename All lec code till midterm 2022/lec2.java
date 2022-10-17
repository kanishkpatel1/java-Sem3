//adding an element at the end of the array
import java.util.*;
public class lec2{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the index: ");
        int end=sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[arr1.length + 1];
       for(int i=0;i<arr1.length;i++){
        arr1[i]=i+1;
       }
        for (int i = 0; i < arr2.length; i++) {
            if(i<end){
            arr2[i] = arr1[i];
            }
            if (i == end) {
                arr2[i] = 123;
            }
            if(i>end){
                arr2[i]=arr1[i-1];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}

