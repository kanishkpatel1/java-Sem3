class Shape{
    public void area(){
    System.out.println("displays area: ");
    }

}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle{
public void area(int l,int h){
    System.out.println(1/2*l*h);
}
}
class circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class inherit {
public static void main(String[] args) {

    Shape s1=new Shape();
    s1.area();   
    circle c1=new circle();
    c1.area(5);   //calling area method of circle classs

   
}
}
