public class lec1 {
    public static void main(String[] args) {
        int[] arr={5,10,20,4,200,20,12,5,3,4};
        int max=Integer.MIN_VALUE;
        int a=0;
   
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
a=i;
            }
          
        }

System.out.println("maximum element in the arrya is  :"+max);
System.out.println("index is"+a);
    }
}
