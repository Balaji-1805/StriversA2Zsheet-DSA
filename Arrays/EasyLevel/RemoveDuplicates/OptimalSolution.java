import java.util.Scanner;

class OptimalSolution
{
    static int removeDuplicates(int[] arr)
    {
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
                i+=1;
                arr[i]=arr[j];
            }
        }
        return i+1;
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
        int length=removeDuplicates(arr);
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}