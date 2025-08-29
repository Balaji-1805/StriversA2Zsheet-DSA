import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    static void swap(ArrayList<Integer> arr,int i,int j)
    {
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    static void selectionSort(ArrayList<Integer> arr)
    {
        int n=arr.size();
        for(int i=0;i<=n-2;i++)
        {
            int mini=i;
            for(int j=i;j<=n-1;j++)
            {
                if(arr.get(j)<arr.get(mini)) mini=j;
            }
            swap(arr, i, mini);
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(7,5,9,2,8));
        System.out.println("Before Sorting:");
        System.out.println(arr);
        System.out.println("After Sorting:");
        selectionSort(arr);
    }
}
