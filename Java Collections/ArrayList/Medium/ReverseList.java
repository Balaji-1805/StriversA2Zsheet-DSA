import java.util.ArrayList;
import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // for(int i=numbers.size()-1;i>=0;i--)
        // {
        //     System.out.print(numbers.get(i)+" ");
        // }
        System.out.println("ArrayList:"+numbers);
        int left=0,right=numbers.size()-1;
        while(left<right)
        {
            int temp=numbers.get(left);
            numbers.set(left,numbers.get(right));
            numbers.set(right,temp);
            left++;
            right--;
        }
        System.out.println("After Reversing:");
        System.out.println("ArrayList:"+numbers);
    }
}
