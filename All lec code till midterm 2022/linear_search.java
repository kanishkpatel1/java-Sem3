import java.util.*;

public class linear_search {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int n=sc.nextInt();

        for(int i=0;i<arr.length;i++ ){
            if(arr[i]==n){
                System.out.println("number matched");
            }

        }

    }
}
