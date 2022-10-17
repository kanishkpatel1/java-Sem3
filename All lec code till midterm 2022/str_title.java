public class str_title {
    public static void main(String[] args) {
        String name = "dhruva pratap singh";
        String abc = "";
        char a = 32;
        for (int i = 0; i < name.length(); i++) {
            if(i==0){
                String asa="";
                asa+=name.charAt(0);
                String q=asa.toUpperCase();
                abc+=q;
                i++;
            }
            if (name.charAt(i) == a){
                String as = "";
                as += name.charAt(i + 1);
                abc+=" ";
                String p = as.toUpperCase();
               // System.out.println(p);
                abc += p;
                
                i++;
                
            } else
                abc += name.charAt(i);

        }
        System.out.println(abc);
    }
}
