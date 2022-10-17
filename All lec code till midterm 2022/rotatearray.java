public class rotatearray {
    public static void main(String[] args) {
        int st=3;
        
        int arr[]={2,4,5,1};
        int n=arr.length;
        int brr[]=new int[n];
        for(int i=st;i<n;i++){
brr[i-st]=arr[i];
        }
        for(int i=0;i<st;i++){
            brr[i+st]=arr[i];
        }


        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
