import java.util.Scanner;

public class Pattern12 {
    static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int space=(n-i)*2;
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print("-");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern12.pattern(rows);
        sc.close();
    }
}
