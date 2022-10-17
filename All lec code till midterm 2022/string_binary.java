public class string_binary {
    public static void main(String[] args) {
        String str="12";

int n=0;

        for(int i=0;i<str.length();i++){
        
             char a=str.charAt(i);
            if(a=='1'|| a=='0'){
                n++;
            }
            }
            if(n==str.length()){
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }

            
        }

    }

