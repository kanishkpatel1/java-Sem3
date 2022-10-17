public class inverseas {
    public static void main(String[] args) {
        int a[]={0,2,4,1,3};
        int n;
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
         int t=a[i];
        b[t]=i;
        
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
