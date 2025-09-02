import java.util.Arrays;
import java.util.Scanner;

public class BruteForce {
    public static int secondLargestElement(int[] arr)
    {
        int n=arr.length;
        Arrays.sort(arr);
        int firstMaxElement=arr[n-1];
        int secondLargestElement=0;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=firstMaxElement) secondLargestElement=arr[i];
            break;
        }
        return secondLargestElement;
    }
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
        int secondLargestElement=secondLargestElement(arr);
        System.out.println("Second Largest Element is "+secondLargestElement);
    }
}


// Time Complexity:O(n log n) (sort+loop --> O(n logn)+ O(n) = O(n log n) )
// Space Complexity:O(1);