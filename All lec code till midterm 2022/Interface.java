interface animal{
    int eye=2;
    void walk();
}
interface hervibores{

}
class horse implements animal,hervibores{
    public void walk(){
        System.out.println("It has four legs");
    }

}


public class Interface {
    public static void main(String[] args) {
        horse h1=new horse();
        h1.walk();
    }
}
