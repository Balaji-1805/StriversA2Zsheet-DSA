import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Iterator;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,4,3,5,3,5));
        int maxNumber=Integer.MIN_VALUE;

        //using iterator
        // Iterator<Integer> it=numbers.iterator();
        // while(it.hasNext())
        // {
        //     int num=it.next();
        //     if(maxNumber<num)
        //     {
        //         maxNumber=num;
        //     }
        // }

        //using for each loop
        // for(Integer num:numbers)
        // {
        //     if(num>maxNumber)
        //     {
        //         maxNumber=num;
        //     }
        // }

        //using for loop
        for(int i=0;i<numbers.size();i++)
        {
            int num=numbers.get(i);
            if(num>maxNumber)
            {
                maxNumber=num;
            }
        }
        System.out.println("Max Number:"+maxNumber);
    }
}
