import java.util.Scanner;

public class Pattern17 {
    static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch++);
            }
            for(int j=1;j<i;j++)
            {
                System.out.print((char) (ch-j-1));
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern17.pattern(rows);
        sc.close();
    }
}
