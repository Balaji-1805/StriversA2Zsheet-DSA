import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,2,1));
        System.out.println("ArrayList:"+numbers);
        int left=0,right=numbers.size()-1;
        boolean res=true;
        while(left<right)
        {
            if(numbers.get(left)!=numbers.get(right))
            {
                res=false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(res?"Palindrome":"Not a Palindrome");
    }
}
