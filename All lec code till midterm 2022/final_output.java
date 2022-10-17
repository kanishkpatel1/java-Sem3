// problem---< outut is 3.14 because of final keyword 
// class check {
//     final double pi;
//     public check()
// {
//     pi=3.14;
// }

// }
// public class Sample{
//     public static void main(String[] args) {
//         check a=new check();   
//         System.out.println(a.pi);
//     }
// }




// problem 2--> output is 11 because of prameter value 
class check {
    final double pi;
    public check()
{
    pi=3.14;
}


public check(double pi)
{
    this.pi=pi;
}
}
public class final_output{
    public static void main(String[] args) {
        check a=new check(22/2);    //we we make object of parameter method
        check b=new check();       // here we make object of without parameter method
        System.out.println(a.pi);   //output is --> 11.0
        System.out.println(b.pi);  //output is -->3.14
    }
}

