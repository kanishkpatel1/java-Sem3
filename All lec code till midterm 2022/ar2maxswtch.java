public class ar2maxswtch {
    public static void main(String[] args) {
        int []arr1={1,4,3,5,8,9,11};   //---> for this ans is 43
        int []arr2={4,2,3,7,9,8,10};
       
        int max=0;
        int s1=0,s2=0;
        for(int i=0;i<arr1.length;i++){
            s1+=arr1[i];
            s2+=arr2[i];
           if(arr1[i]==arr2[i]){
            if(s1>s2){

                max+=s1;
            }
            else{
                max+=s2;
            }
            s1=0;
            s2=0;
            
            }
          }
          if(s1>s2){

            max+=s1;
        }
        else{
            max+=s2;
        }

System.out.println(max);
    }
}
