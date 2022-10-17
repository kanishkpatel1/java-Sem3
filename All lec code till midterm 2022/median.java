// leetcode 4 median of 2 sorted arrays
import java.util.Arrays;
public class median {
    public static void main(String[] args) {
        int nums1[]={1,2,2};
        int nums2[]={5,6,7};
        int n1=nums1.length;
        int n2=nums2.length;
       
          int n=n1+n2;
        int arr[]=new int[n];
        System.out.println(n);
    // System.arraycopy(nums1, 0, arr, 0, n1);
    // System.arraycopy(nums2, 0, arr, n1, n2);
  for(int i=0;i<n1;i++){
     arr[i]=nums1[i];
}  
  for(int i=n1;i<n;i++){
    int a=0;
     arr[i]=nums2[a];
     a++;
}    

    
    
    Arrays.sort(arr);
          for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
          }
  if(n%2==0){
    int z = n / 2;
    double e = arr[z];
    double q = arr[z - 1];

    double ans = (e + q) / 2;
    System.out.println(ans);
  }
  else{
    int z = n/ 2;
    System.out.println((double)arr[z]);
  }
          }
          }
          
         

