import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        //To store elements in sorted order we use TreeSet
        //Slowe than HashSet due to Sorting
        Set<String> names=new TreeSet<>();
        names.add("Zenistu");
        names.add("Tanjiro");
        names.add("Yorichii");
        names.add("Tanjiro");
        System.out.println(names);
    }
}
