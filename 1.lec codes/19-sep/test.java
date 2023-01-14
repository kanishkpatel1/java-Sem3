class Hello{
    String name;
}

// public class test{
//     public static void main(String[] args) {
//         Hello h=new Hello();
//         h.name="kanishk";
// System.out.println(h.name);
//     }
// }

public class test extends Hello{
    public static void main(String[] args) {
        test h=new test();
        h.name="kanishk";
System.out.println(h.name);
    }
}