public class vote {
    public static boolean veligible(int age){
        if(age<18){
            return false;
        }
        else{
            return true;
        }
 }

 public static void main(String[] args) {
    int age=18;
    boolean ans=veligible(age);
    System.out.println(ans);
 }
}
