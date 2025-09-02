import java.util.Arrays;
import java.util.Scanner;

public class BruteForce {
    static int maxElement(int[] arr)
    {
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        if(n<=0)
        {
            System.out.println("Array is empty ,No max element is there");
            return;
        }
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" Element:");
            arr[i]=sc.nextInt();
        }
        int maxNumber=maxElement(arr);
        System.out.println(maxNumber!=0 ? "Max Element is "+maxNumber:"No max Element");
    }
}


// Time Complexity:O(n log n) (sorting) 
// Space complexity:O(1)