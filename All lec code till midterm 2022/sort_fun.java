import java.util.Arrays;

public class sort_fun{
public static void main(String[] args) {
    int[] arr1={8,9,5,10,200};
    String[] arr2={"kanishk","patel","asda","sdf"};
    System.out.println("Array before sort:"+Arrays.toString(arr1));
    Arrays.sort(arr1);
    System.out.println("array after sort is"+Arrays.toString(arr1));

    System.out.println("string array before sort "+Arrays.toString(arr2));
    Arrays.sort(arr2);
    System.out.println("string array after sort "+Arrays.toString(arr2));
}
}