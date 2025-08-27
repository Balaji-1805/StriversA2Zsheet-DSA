import java.util.*;
public class FrequencyArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,3,4,1,2,6};
        int hashArr[]=new int[100];
        for(int ele:arr)
        {
            hashArr[ele]++;
        }
        HashSet<Integer> seen=new HashSet<>();
        for(int i:arr)
        {
            if(seen.add(i))
            {
                System.out.println(i+":"+hashArr[i]);
            }
        }
    }
}
