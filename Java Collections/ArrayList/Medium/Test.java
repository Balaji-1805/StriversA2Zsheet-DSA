import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
// import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,3,2,3,4,1,3));
        numbers.sort(null);
        System.err.println("ArrayList:"+numbers);
        // Without Hashset
        // Iterator<Integer> it=numbers.iterator();
        // while (it.hasNext()) {
        //     int num=it.next();
        //     if(numbers.indexOf(num)!=numbers.lastIndexOf(num))
        //     {
        //         it.remove();
        //     }
        // }
        // System.out.println("Removing Duplicates:"+numbers);

        // With HashSet
        HashSet<Integer> seen=new HashSet<>();
        for(Integer num:numbers)
        {
            if(!seen.contains(num))
            {
                seen.add(num);
            }
        }
        numbers=new ArrayList<>(seen);
        // System.out.println("Removing Duplicates:"+seen);
        System.out.println("Removing Duplicates:"+numbers);
    }
}
