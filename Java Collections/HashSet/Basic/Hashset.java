import java.util.*;
class Hashset
{
    public static void main(String[] args) {
        // HashSet stores unique values and unordered
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);//duplicate value it is not added into set
        System.out.println("Set:"+numbers);
        System.out.println(numbers.contains(10)?"Existed":"Not Existed");
    }
}