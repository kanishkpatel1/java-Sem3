// Advantage of method overloading
// Method overloading increases the readability of the program.

// Different ways to overload the method-->
// There are two ways to overload the method in java

// By changing number of arguments
// By changing the data type

//1) Method Overloading: changing no. of arguments
class Adder{  
    static int add(int a,int b){return a+b;}  
    static int add(int a,int b,int c){return a+b+c;}  
    }  
    class TestOverloading1{  
    public static void main(String[] args){  
    System.out.println(Adder.add(11,11));  
    System.out.println(Adder.add(11,11,11));  
    }} 

// outuput--22
//          33


//2) Method Overloading: changing data type of arguments
class Adder1{  
    static int add(int a, int b){return a+b;}  
    static double add(double a, double b){return a+b;}  
    }  
    class TestOverloading2{  
    public static void main(String[] args){  
    System.out.println(Adder1.add(11,11));  
    System.out.println(Adder1.add(12.3,12.6));  
    }}

    //output--> 22
//              24.9