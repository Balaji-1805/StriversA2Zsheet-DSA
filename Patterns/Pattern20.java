import java.util.Scanner;

public class Pattern20 {
    static void pattern(int n)
    { 
       for(int i=0;i<n;i++)
       {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*(n-i-1);j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
       }

       for(int i=1;i<n;i++)
       {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*(i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
       }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern20.pattern(rows);
        sc.close();
    }
}
