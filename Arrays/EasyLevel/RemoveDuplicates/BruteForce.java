// Removing Duplicates from sorted Array
import java.util.*;
class BruteForce
{
    static ArrayList<Integer> removeDuplicates(int[] arr)
    {
        ArrayList<Integer> uniqueArr=new ArrayList<>();
        for(int num:arr)
        {
            if(!uniqueArr.contains(num)) uniqueArr.add(num);
        }
        return uniqueArr;
    }
    static HashSet<Integer> removeExistingElements(int[] arr)
    {
        HashSet<Integer> uniqueArr=new HashSet<>();
        for(int num:arr)
        {
            if(!uniqueArr.contains(num)) uniqueArr.add(num);
        }
        return uniqueArr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Sorted Elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Without Duplicates:");
       ArrayList<Integer> result=removeDuplicates(arr);
       HashSet<Integer> uniquearr=removeExistingElements(arr);
       System.out.println(result);
       System.out.println(uniquearr);
    }
}