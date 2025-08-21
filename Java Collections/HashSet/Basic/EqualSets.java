import java.util.Arrays;
import java.util.HashSet;

public class EqualSets {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>(Arrays.asList(2,3,5,7));
        HashSet<Integer> set2=new HashSet<>(Arrays.asList(1,3,5,7));
        System.out.println(!set1.equals(set2)?"Not Equal":"Equal Sets");

        HashSet<Integer> set3=new HashSet<>(Arrays.asList(1,3,5,7));
        HashSet<Integer> set4=new HashSet<>(Arrays.asList(1,3,5,7));
        System.out.println(!set3.equals(set4)?"Not Equal":"Equal Sets");
    }
}
