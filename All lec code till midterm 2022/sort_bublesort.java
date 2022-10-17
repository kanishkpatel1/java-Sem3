
import java.util.Arrays;

public class sort_bublesort {
    public static void main(String[] args) {
        
        int[] arr={5,9,1,2,78};
        int temp=0;
        int []arr1=new int[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
System.out.println(Arrays.toString(arr));
 }
}
