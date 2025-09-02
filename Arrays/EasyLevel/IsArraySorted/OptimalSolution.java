import java.util.Scanner;

public class OptimalSolution {
        public static boolean isSorted(int[] arr)
    {
        boolean isSorted=true;
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]) 
            {
                isSorted=false;
                break;
            }
        }
        return isSorted;
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
        System.out.println(isSorted(arr)? "Array is in Sorted Order":"Array is not is Sorted Order");
   }

}

// Time Complexity : O(n) (for loop --> n input size)
// Space Complexity : O(1)