import java.util.*;
public class arr{
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        l1.add(10); 
        l1.add(1);
       l1.add(1, 1);  //add element at specified position      
         l1.add(11);  //adding element in list 
        System.out.println(l1.indexOf(1));     //gives the index of 1
        System.out.println(l1.lastIndexOf(1));  //gives the last  index of 1
        l1.remove(1);  //removes the first occurance of element 
        l2.addAll(l1);  //add all element into l2
        for(int i=0;i<l1.size();i++){

            System.out.print(l1.get(i)+" ");
        }
        System.out.println(l1);
        System.out.println();
        for(int i=0;i<l2.size();i++){
            System.out.print(l2.get(i)+" ");
        }

    }
}