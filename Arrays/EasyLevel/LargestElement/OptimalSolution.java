import java.util.Scanner;

public class OptimalSolution {
    public static int maxElement(int[] arr)
    {
        int n=arr.length;
        int maxElement=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(maxElement<arr[i])  maxElement=arr[i];
        }
        return maxElement;
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
        System.out.println(maxNumber>0? "Max Element is "+maxNumber:"No max Element");
    }
}


// Time complexity:O(n) (for loop -> n times)
// Space Complexity:O(1)