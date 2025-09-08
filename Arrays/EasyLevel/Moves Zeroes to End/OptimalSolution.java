import java.util.Scanner;

public class OptimalSolution {
    public static void moveZeroesEnd(int[] arr)
    {
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<n)
        {
            arr[j++]=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" Element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Moving Zeroes to End");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        moveZeroesEnd(arr);
        System.out.println("\nAfter Moving Zeroes to End:");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}



// Time Complexity:O(n)
// Space Complexity:O(1) [since moved zeroes in given array]