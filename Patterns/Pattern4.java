import java.util.Scanner;
public class Pattern4 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)//outer loop
        {
            for(int j=1;j<=i;j++)//inner loop
            {
                System.out.print(i);
            }
            System.out.println();//new row new line
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern4.pattern(rows);
        sc.close();
    }
}
