//Arrays are used to store collection of elements of similar data type
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter "+(i+1)+" value:");
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
