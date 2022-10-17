import java.util.Scanner;
public class array2d {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of rows");
    int r=sc.nextInt();
    System.out.println("Enter the value of columns");
    int c=sc.nextInt();
    int [][] marks=new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.printf("Enter the value of element marks[%d][%d]: ",i,j);
            marks[i][j]=sc.nextInt();
        }
    }

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(marks[i][j]+" ");
        }
        System.out.println();
    }
}
}
