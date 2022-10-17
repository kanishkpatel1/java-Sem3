public class range_prime {
    
        public static boolean prime(int a){
            if(a==2){
                return true;
            }
            for(int i=2;i<=a/2;i++){
                if(a%i==0){
                    return false;
                }
                
            }
            return true;
        }
        
        public static void main(String[] args) {
            
        
            int n=10;
            for(int i=1;i<=n;i++){
                if(prime(i)){
                    System.out.println(i);
                }
            }
        }
    }

