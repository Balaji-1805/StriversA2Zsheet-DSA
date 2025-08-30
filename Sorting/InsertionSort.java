// Insertion Sort 
public class InsertionSort {
    static void insertionSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            int j=i;
            while(j>0&&arr[j-1]>arr[j])
            {
               
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println("Before Sorting");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        insertionSort(arr);//calling insertionSort function by passing array
        System.out.println("After Sorting");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }

    }
}
