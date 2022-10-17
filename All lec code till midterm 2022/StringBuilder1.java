
//1) StringBuilder append() method

// class StringBuilderExample{  
//     public static void main(String args[]){  
//     StringBuilder sb=new StringBuilder("Hello ");  
//     sb.append("Java");//now original string is changed  
//     System.out.println(sb);//prints Hello Java  
//     }  
//     }


//2) StringBuilder insert() method

// class StringBuilderExample2{  
//     public static void main(String args[]){  
//     StringBuilder sb=new StringBuilder("Hello ");  
//     sb.insert(1,"Java");//now original string is changed  
//     System.out.println(sb);//prints HJavaello  
//     }  
//     } 

//3) StringBuilder replace() method

// class StringBuilderExample3{  
//     public static void main(String args[]){  
//     StringBuilder sb=new StringBuilder("Hello");  
//     sb.replace(1,3,"Java");  
//     System.out.println(sb);//prints HJavalo  
//     }  
//     }


//4) StringBuilder delete() method
// class StringBuilderExample4{  
//     public static void main(String args[]){  
//     StringBuilder sb=new StringBuilder("Hello");  
//     sb.delete(1,3);  
//     System.out.println(sb);//prints Hlo  
//     }  
//     } 


//5) StringBuilder reverse() method
// class StringBuilderExample5{  
//     public static void main(String args[]){  
//     StringBuilder sb=new StringBuilder("Hello");  
//     sb.reverse();  
//     System.out.println(sb);//prints olleH  
//     }  
//     } 

// 6) StringBuilder capacity() method--->
// The capacity() method of StringBuilder class returns
//  the current capacity of the Builder. The default capacity of the Builder is 16. 
//  If the number of character increases from its current capacity,
//   it increases the capacity by (oldcapacity*2)+2. 
//   For example if your current capacity is 16, it will be (16*2)+2=34


// class StringBuilderExample6{    
//     public static void main(String args[]){    
//     StringBuilder sb=new StringBuilder();    
//     System.out.println(sb.capacity());//default 16    
//     sb.append("Hello");    
//     System.out.println(sb.capacity());//now 16    
//     sb.append("Java is my favourite language");    
//     System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    
//     }    
//     } 


//7) StringBuilder ensureCapacity() method
//The ensureCapacity() method of StringBuilder class ensures that the given capacity is
//the minimum to the current capacity. If it is greater than the current capacity, it
//increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34




class StringBuilder1{    
    public static void main(String args[]){    
    StringBuilder sb=new StringBuilder();    
    System.out.println(sb.capacity());//default 16    
    sb.append("Hello");    
    System.out.println(sb.capacity());//now 16    
    sb.append("Java is my favourite language");    
    System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    
    sb.ensureCapacity(10);//now no change    
    System.out.println(sb.capacity());//now 34    
    sb.ensureCapacity(50);//now (34*2)+2    
    System.out.println(sb.capacity());//now 70    


    }    
    }