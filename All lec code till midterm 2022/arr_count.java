public class arr_count {

    public static boolean arm(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;

                }
                if(count>1){
                    return true;
                }

            }
        }

        return false;

    }

    public static void main(String[] args) {
        int count=0;
        int arr[]={1,1,2,3,4};
        System.out.println(arm(arr));
    }

}
