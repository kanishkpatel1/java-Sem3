
//replace the word with another word
import java.util.Arrays;
public class streplace {
       public static void main(String[] args) {
        String ar="my name is kanishk patel and I am from kannauj";
        String []st=ar.split(" ");
        String []sss=new String[st.length];
        String wr="kanishk";
        String rep="TTanishk";

        for(int i=0;i<st.length;i++){
            if(st[i].equals("kanishk")){
                sss[i]=rep;
                
            }
            else{
                sss[i]=st[i];
            }
           }
        System.out.println(Arrays.toString(sss));
        }
}