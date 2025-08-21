import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemovingElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(10,50,33,55,89,23,47,90,87));
        //Throws current modification Exception
        // for(Integer num:numbers)
        // {
        //     if(num>50) numbers.remove(num);
        // }
        // System.out.println(numbers);
        //Use Iterator instead of for loop or for each loop
        Iterator<Integer> it=numbers.iterator();
        while(it.hasNext())
        {
            if(it.next()>50)
            {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
