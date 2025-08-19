import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        List<String> names=new LinkedList<>();
        names.add("Balaji");
        names.add("Gojo Satoru");
        //Add element at first
        names.addFirst("Ryomen Sukuna");
        //Add Element at last
        names.addLast("Goku");
        names.add(3,"Akaza");
        System.out.println("LinkedList:"+names);
        //remove element at first
        System.out.println("First Element in List:"+ names.removeFirst());
        //remove element at last
        System.out.println("Element at Last :"+names.removeLast());
        System.out.println(names.contains("Gojo Satoru"));
        names.clear();
        System.out.println(names);

    }
}
