import java.util.Scanner;
public class Pattern11 {
     public static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            int num=1;
            int arr[]=new int[i+1];
            for(int k=0;k<arr.length;k++)
            {
                if(num==1)
                {
                    arr[k]=1;
                    num=0;
                }
                else
                {
                    arr[k]=0;
                    num=1;
                }
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(arr[i-j]);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern11.pattern(rows);
        sc.close();
    }
}
