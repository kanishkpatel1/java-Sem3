public class str_remove {
    public static void main(String[] args) {
        
    
    String str="my name is kanishk";
    String sss="";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==(char)(97)||str.charAt(i)==(char)(101)||str.charAt(i)==(char)(105)||str.charAt(i)==(char)(111)||str.charAt(i)==(char)(117)||str.charAt(i)==(char)(79)||str.charAt(i)==(char)(69)||str.charAt(i)==(char)(65)||str.charAt(i)==(char)(85)||str.charAt(i)==(char)(73)){
continue;
        }
        else{
            sss+=str.charAt(i);
        }
    }
    System.out.println(sss);
        }
}
