//gfg solution

public class replace_reverse {
    public static void main(String[] args) {
        String s="Abcm";
        String str="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)<='z' && s.charAt(i)>='a')){
        
                str+=(char)('a'+'z'-s.charAt(i));
                }
            else{
                     str+=(char)('A'+'Z'-s.charAt(i));
                }
        
                }
        System.out.println(str);
    }
}
