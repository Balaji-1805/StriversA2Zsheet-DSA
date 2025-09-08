import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BruteForce {
    public static ArrayList<Integer> unionSortedArray(int[] arr1,int[] arr2)
    {
        HashSet<Integer> set=new HashSet<>();
        int m=arr1.length;
        int n=arr2.length;
        int i=0,j=0;
        while(i<m)
        {
            if(!set.contains(arr1[i]))
            {
                set.add(arr1[i]);
            }
            i++;
        }
        while(j<n)
        {
            if(!set.contains(arr2[j]))
            {
                set.add(arr2[j]);
            }
            j++;
        }
        ArrayList<Integer> newArr=new ArrayList<>();
        for(Integer num:set)
        {
            newArr.add(num);
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10};
        ArrayList<Integer> unionArr=new ArrayList<>();
        unionArr=unionSortedArray(arr1, arr2);
        System.out.println("Union Array of two Sorted Arrays:");
        for(int num:unionArr)
        {
            System.out.print(num+" ");
        }
    }
    
}



// Time complexity:O((m+n) log(m+n)) 
//Space Complexity:O(m+n)