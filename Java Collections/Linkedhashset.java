import java.util.*;
public class Linkedhashset {
    public static void main(String[] args)
    {
        //LinkedHashSet is used to store in the inserted order
        Set<Integer> numbers=new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        System.out.println(numbers);
    }
}
