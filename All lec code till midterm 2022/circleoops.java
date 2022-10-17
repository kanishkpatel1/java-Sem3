class circle{
    public double radious;
    public double area()
    {
        return Math.PI*radious*radious;
    }
    public double perimeter(){
        return 2*Math.PI*radious;
    }
    public double circumference(){
        return perimeter();
    }
}
public class circleoops {
    public static void main(String[] args) {
        circle c1=new circle();
        c1.radious=7;
        System.out.println("Areat: "+c1.area());
        System.out.println("perimeter: "+c1.perimeter());
        System.out.println("circumference: "+c1.circumference());
    }
}
