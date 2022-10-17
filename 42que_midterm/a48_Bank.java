class Bank{
    void kanishk(){
        System.out.println("this is bank class: ");
    }
}
class SBI extends Bank{
    void kanishk(){
        System.out.println("This is Sbi bank: ");
    }
}
class AXIS extends Bank{
    void kanishk(){
        System.out.println("This is Axis bank: ");
    }
}
class ICICI extends Bank{
    void kanishk(){
        System.out.println("This is Icici bank; ");
    }
}
public class a48_Bank {
    public static void main(String[] args) {
        Bank obj=new Bank();
        ICICI as=new ICICI();
        AXIS ax=new AXIS();
        SBI sb=new SBI();
        obj.kanishk();
        sb.kanishk();
        ax.kanishk();
        as.kanishk();
    }  
}
