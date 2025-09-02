import java.util.Scanner;

public class OptimalSolution {
    public static int secondMaxElement(int[] arr)
    {
        int n=arr.length;
        int firstMaxElement=-1,secondMaxElement=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>firstMaxElement)
            {
                secondMaxElement=firstMaxElement;
                firstMaxElement=arr[i];
            }
            else if(arr[i]!=firstMaxElement && arr[i]>secondMaxElement)
            {
                secondMaxElement=arr[i];
            }
        }
        return secondMaxElement;
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
        int secondLargestElement=secondMaxElement(arr);
        System.out.println("Second Largest Element is "+secondLargestElement);
    }
}


// Time Complexity:O(n) (for loop --> n times)
// Space Complexity:O(1)