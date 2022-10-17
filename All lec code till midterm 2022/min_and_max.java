public class min_and_max {
    public static void main(String[] args) {
        int[] arr={5,10,20,4,200};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
System.out.println("min element in the array is :"+min);
System.out.println("maximum element in the arrya is :"+max);
    }
}
