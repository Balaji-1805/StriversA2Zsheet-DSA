import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        //Set are used to store unique elements
        //They are non index based ;unordered collection of elements
        Set<Integer> id=new HashSet<>();
        id.add(10);
        id.add(20);
        id.add(30);
        id.add(30);//duplicate;
        System.out.println(id);
        System.out.println(id.add(10));//returns false if not added otherwise true
        System.out.println(id.remove(11)); //returns true if removed otherwise false
        System.out.println(id.size());
        System.out.println(id.contains(20));
    }
}
