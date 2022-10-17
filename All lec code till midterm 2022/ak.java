public class ak {
    public static void main(String[] args) {
        try{
        int a=100/0;  //give ArithmeticException error
        }
        catch(ArithmeticException e){System.out.println(e);}

        System.out.println("rest of the program");
    }
    
}
