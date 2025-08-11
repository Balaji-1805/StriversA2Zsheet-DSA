//2D arrays are used to work with matrices,graphs etc;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[][] arr=new int[3][5]; //left index determine row and right determine column
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("Enter "+(i)+""+""+(j)+" value:");
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The 2D Array is:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
