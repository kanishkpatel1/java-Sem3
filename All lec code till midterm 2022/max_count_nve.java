public class max_count_nve {
    public static  int chq(int []arr){
        int max=0,indx=0;
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                    if(count>max){
                        max=count;
                        indx=i;
                    }
                }
            }
        }
        return arr[indx];
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,-3,2,2};
        System.out.println(chq(arr));
    }
}
