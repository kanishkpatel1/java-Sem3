class Employee1{
    String name;
    int age;
    Employee1 head;
    Employee1(String name,int age){
        this.name = name;
        this.age = age;
    }
    void set(Employee1 e){
        this.name = e.name;
        this.age = e.age;
    }
}
class book{
    int page;
    book(int p){
        page = p;
    }
    book add(book b){
        return new book(this.page+b.page);
    }
}
public class ops_dsa {
    public static void main(String[] args) {
        book b1 = new book(100);
        book b2 = new book(200);
        book b3 = new book(300);
        book b4 = b1.add(b2).add(b3);
        System.out.println(b4.page);
        System.out.println(new book(200).add(b1).add(b2).add(b3).page);
        System.out.println(b1.add(b2).add(b3).page);
        b4.add(new book(234));

    }
}