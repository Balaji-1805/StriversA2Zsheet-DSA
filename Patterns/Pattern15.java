import java.util.Scanner;

public class Pattern15 {
    static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            char ch='A';
            for(int j=i;j<n;j++)
            {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern15.pattern(rows);
        sc.close();
    }
}
