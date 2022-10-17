
// string is immutable;
//string buffer is mutable;
public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sbuff=new StringBuffer("hello java");

        StringBuffer sb1=new StringBuffer();
        String s1="Hello java";
        s1.concat(" kanishk");  //here kanishk will not append in the s1;
        sbuff.append("programmingjhgg");  //it will append the string 
        System.out.println(s1);
        System.out.println(sbuff);   //it will append
        System.out.println(sbuff.capacity());  //it will give the space of consumed by sbeff

        sb1.append("ajgjhg");
        System.out.println(sb1.capacity());



        StringBuffer sa= new StringBuffer("Hello");
        sa.insert(1,"Java");   //insert the string java at index 1 in string hello--> o/p-HJavaello
        System.out.println(sa);

        StringBuffer sa1= new StringBuffer("Hello");
        sa1.replace(1, 3, "Java");    //replace the string from index 1 to 3;
        System.out.println(sa1);
    }
}
