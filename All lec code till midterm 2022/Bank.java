// It is also called -------->Encapsulation
//We can create a fully encapsulated class in Java by making all the data
// members of the class private. Now we can use setter 
// and getter methods to set and get the data in it.



class Account{
    public String name;
    private String password;
    public String getpassword() { //getter setter for private
return this.password;
    }
    public void setPassword(String pass){  //getter setter for private
this.password=pass;
    }

}
public class  Bank{
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="kanishk";

        account1.setPassword("@%^&*");

System.out.println("your password is"+account1.getpassword());  //getter setter for private
System.out.println(account1.name);
        
    }
}
