class P{
    void m1(){
        System.out.println("This is parent Class: ");
    }

}
class sub extends P{
    void m2(){
        System.out.println("This is Child Class");
    }
}

public class a43 {
    public static void main(String[] args) {
        P obj1=new P();
        sub obj2=new sub();

        obj2.m1();

        //obj1.m2()  //we cant call method of child class by the method of parent class 
    }
}
