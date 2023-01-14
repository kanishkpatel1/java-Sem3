public class fibo {
    public static void main(String[] args) {
        int n=5;
        long a=0;
        long b=1;
        for(int i=0;i<n;i++){
        System.out.println(a);
            a=b;
            b=a+b;
        }
    
    }
}
