public class test {
    String name;  //it is valid
    
    {
        System.out.println("hsdkdsjfkljsdfkljf");
        name="kanishk";  //this is a instance block
    }
test(){
    System.out.println("constuctor bloc");  //it will execute after instance
}
static{
    System.out.println("static block");   // it will execute before main method

 
}

    // String name;
    //name="kanishk";  //it is invalid

    public static void main(String[] args) {
      test t=new test();  
     
    }
}
