abstract class Animal{
abstract void walk();
}
class horse extends Animal{
    public void walk() {
        System.out.println("it has four legs");
    }
}
class chicken extends Animal{
    public void walk() {
        System.out.println("it has two legs");
    }
}

public class abstraction {
public static void main(String[] args) {
    horse h=new horse();
    h.walk();
    chicken ch=new chicken();
    ch.walk();
}
}
