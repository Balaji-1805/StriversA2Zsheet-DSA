// Bubble Sort
public class BubbleSort {
    static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,5,9,2,8,4,3,1,6};
        System.out.println("Array:");
        for(int num:arr)System.out.print(num+" ");
        System.out.println("\nBubble Sort:");
        bubbleSort(arr);
    }
}
