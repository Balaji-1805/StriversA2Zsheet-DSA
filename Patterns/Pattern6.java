import java.util.Scanner;

public class Pattern6 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern6.pattern(rows);
        sc.close();
    }
}
