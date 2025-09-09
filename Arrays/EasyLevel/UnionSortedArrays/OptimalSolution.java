import java.util.ArrayList;
import java.util.Scanner;

public class OptimalSolution {
    public static ArrayList<Integer> unionSortedArray(int[] arr1,int[] arr2)
    {
        ArrayList<Integer> newArr=new ArrayList<>();
        int m=arr1.length;
        int n=arr2.length;
        int i=0,j=0;
        int lastAdded=Integer.MIN_VALUE;
        while(i<m&&j<n)
        {
            if(arr1[i]<arr2[j]&&lastAdded!=arr1[i])
            {
                newArr.add(arr1[i]);
                lastAdded=arr1[i];
                i++;
            }
            else if(arr1[i]==arr2[j]&&lastAdded!=arr1[i])
            {
                newArr.add(arr1[i]);
                lastAdded=arr1[i];
                i++;
                j++;
            }
            else 
            {
                if(lastAdded!=arr2[j])
                newArr.add(arr2[j]);
                lastAdded=arr2[j];
                j++;
            }
        }
        while(i<m&&lastAdded!=arr1[i])
        {
            newArr.add(arr1[i]);
            lastAdded=arr1[i];
            i++;
        }
        while(j<n&&lastAdded!=arr2[j])
        {
            newArr.add(arr2[j]);
            lastAdded=arr2[j];
            j++;
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={-1,0,1};
        int arr2[]={-2,-1,0};
        ArrayList<Integer> unionArr=unionSortedArray(arr1, arr2);
        if(unionArr.size()!=0)
        System.out.println("Union Array of two Sorted Arrays:");
        for(int num:unionArr)
        {
            System.out.print(num+" ");
        }
        sc.close();
    }
}


// Time Complexity :O(m+n)
// Space Complexity:O(m+n)