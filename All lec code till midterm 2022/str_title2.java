public class str_title2 {
    public static void main(String[] args) {
        String s="my name is kanishk patel";
        String str[]=s.split(" ");
        String result="";
        for(int i=0;i<str.length;i++){
            str[i] = str[i].substring(0,1).toUpperCase() + str[i].substring(1,str[i].length());
            result += str[i]+" ";
        }
        System.out.println(result);
    }
}
