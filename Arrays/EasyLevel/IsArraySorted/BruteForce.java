import java.util.Arrays;
import java.util.Scanner;

public class BruteForce {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" Element:");
            arr[i]=sc.nextInt();
        }
        int sortedArr[]=Arrays.copyOf(arr,n);
        Arrays.sort(arr);
        System.out.println(sortedArr.equals(arr)?"Array is Sorted":"Array is not Sorted");
    }
}
// Time Complexity:O(n log n) (sorting and comparing)
// Space Complexity:O(n) (storing original data into new variable)
