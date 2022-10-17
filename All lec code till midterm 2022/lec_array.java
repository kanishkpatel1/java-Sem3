//adding an element at the end of the array
import java.util.*;
public class lec_array {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[arr1.length + 1];
       for(int i=0;i<arr1.length;i++){
        arr1[i]=i+1;
       }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr1.length) {
                arr2[i] = 100;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
