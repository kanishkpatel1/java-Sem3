

class asdf {
    int a=5,b=5;
    void test(){
        
        System.out.println("no argument: ");
    }
    void test(int a){
        System.out.println("one argument: ");
    }

    void test(int a,int b){
        test();
        System.out.println("two argument: ");
    }

    void test(int a,int b,int c){
        this.a=a;
        this.b=b;
        
        System.out.println("three argument: "+"a "+a+" b "+b+"c "+c );
        test(a, b);
    }
}

public class ths{
    public static void main(String[] args) {
        asdf obj=new asdf();
        obj.test(1, 2, 3);
    }
}

