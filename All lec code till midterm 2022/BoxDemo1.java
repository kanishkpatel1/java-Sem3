class box {
    double width;
double height;
double depth;
double vol(){
    return width*height*depth;}
// method to set dimensions of box
void setDim(double w,double h,double d){
    depth=d;
    width=w;
    height=h;   }}
public class BoxDemo1{
    public static void main(String[] args) {
        box mybox1=new box();
        box mybox2=new box();
        //double vol;
        // mybox1.height=20;
        // mybox1.depth=15;
        // vol=mybox1.width*mybox1.height*mybox1.depth;
        // mybox1.width=10;
// System.out.println(vol);
//     mybox2.width=25;
//     mybox2.height=25;
//     mybox2.depth=25;
//     vol=mybox2.width*mybox2.height*mybox2.depth;
//     System.out.println(vol);
double volume1;
double volume2;
mybox1.setDim(10, 20, 15);
mybox2.setDim(15, 25, 10);

//to get volume of first box
volume1=mybox1.vol();
//to get volume of second box
volume2=mybox2.vol();
System.out.println("volume 1 is "+volume1);
System.out.println("volume 2 is "+volume2);
 }  }