public class str {
    public static void main(String[] args) {
        String st="my name is kanishk patel and are asadsf";
        String str[]=st.split(" ");
        for(int i=0;i<str.length;i++){
            if(i%2==0){
                System.out.print(str[i]+" ");
            }
            else{
                for(int j=str[i].length()-1;j>=0;j--){
                    System.out.print(str[i].charAt(j));

                }
            System.out.print(" ");
            }
        }
    }
}
