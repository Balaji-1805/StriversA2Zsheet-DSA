import java.util.Scanner;

public class BruteForce {
    public static int[] moveZeroesEnd(int[] arr)
    {
        int n=arr.length;
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[j]=arr[i];
                j++;
            }
        }
        while(j<n)
        {
            temp[j++]=0;
        }
        return temp;
    }
    public static void main(String[] args)
    {
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
        arr=moveZeroesEnd(arr);
        System.out.println("\nAfter Moving Zeroes to End:");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}



// Time Complexity:O(n)+O(n-j)=O(n+n-j)=O(2n-j)=O(n)
// Space Complexity:O(n) [since we took duplicate array]