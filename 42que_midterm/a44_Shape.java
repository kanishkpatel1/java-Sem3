class Shape{
    void m1(){
        System.out.println("this is shape: ");
    }
}
class Rectange extends Shape{
    void m2(){
        System.out.println("This is rectanglular shape: ");
    }
}
class Circle extends Shape{
    void m2(){
        System.out.println("This is Circular shape: ");
    }
}

class Square extends Rectange{
    void m3(){
        System.out.println("square is a rectangle");
    }
}
public class a44_Shape {
    public static void main(String[] args) {
        
        Square sq=new Square();
        sq.m1();
        sq.m2();
    }
}
