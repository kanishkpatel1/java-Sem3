//reverse vowel problem gfg
// input ajakeli
//output ijekala

public class vowel {
    public static void main(String[] args) {
        String s="abeci";
        String str="";
        String mn="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                str+=s.charAt(i);
            }
        }
        int l=(str.length()-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
               mn+=str.charAt(l); 
               l--;
            }
            else{
                mn+=s.charAt(i);
            }
            
        }
        System.out.println(mn);
    }
}
