import java.util.Arrays;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> set2=new HashSet<>(Arrays.asList(2,4,6,8));
        HashSet<Integer> set3=new HashSet<>();
        System.out.println("Set1:"+set1);
        System.out.println("Set2:"+set2);
        for(Integer num:set1)
        {
            if(set2.contains(num))
            {
                set3.add(num);
            }
        }
        System.out.println("Intersection Set:"+set3);
        // Union of two sets
        set1.addAll(set2);
        System.out.println("Union Set:"+set1);
    }
}
