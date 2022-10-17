// for method overloading no of arguments should not be same while you change return type it doesn't matter

interface Hello1{
    void m1();
}
interface Hello2{
    void m1();
}
public class a3 implements Hello1,Hello2{
    public void m1(){}   //it will call both the methods of hello1 and hello2

    
    public static void main(String[] args) {
        
    
    }
}