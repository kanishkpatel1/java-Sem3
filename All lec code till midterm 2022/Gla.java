 class Abc {
  static   Abc var1=new Abc();
    // Abc(){

    // }
    private Abc(){

    }
static public Abc hello(){
    return var1;
}

}

public class Gla{
    public static void main(String[] args) {
        Abc a=Abc.hello();
        Abc b=Abc.hello();
        System.out.println(a==b);  //true because we can't make more than one object of this class it  called single turn  point same address
    }
}
