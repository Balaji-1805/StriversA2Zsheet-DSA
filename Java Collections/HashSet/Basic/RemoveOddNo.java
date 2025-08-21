import java.util.HashSet;
import java.util.Iterator;

public class RemoveOddNo{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=1;i<=10;i++)
        {
            set.add(i);
        }
        System.out.println("Set:"+set);
        // To remove odd numbers we use Iterator
        Iterator<Integer> it=set.iterator();
        while(it.hasNext())
        {
            if(it.next()%2!=0)
            {
                it.remove();
            }
        }
        System.out.println("Even Numbers:"+set);
    }
}
