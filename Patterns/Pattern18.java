import java.util.Scanner;

public class Pattern18 {
    static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
          int val=64+n-i;
        for(int j=0;j<=i;j++)
        {
            System.out.print((char) val);
            val++;
        }
        System.out.println();
      }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern18.pattern(rows);
        sc.close();
    }
}
