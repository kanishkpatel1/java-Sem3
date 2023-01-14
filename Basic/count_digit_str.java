public class count_digit_str {
    public static void main(String[] args) {
        String S="hii!! my name is kanihhsk@!$%123";
        String str1="";
        String str2="";
        String str3="";
        for(int i=0;i<S.length();i++){
            if(Character.isAlphabetic(S.charAt(i))){
                str1+=S.charAt(i);
            }
            else if(Character.isDigit(S.charAt(i))){
                str2+=S.charAt(i);
            }
            else{
                str3+=S.charAt(i);
            }
        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
