import java.util.Scanner;

public class Pattern16 {
    static void pattern(int n)
    {
        char ch='A';
        for(int i=0;i<n;i++)
        {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(ch + " ");
                }
                ch++;
                System.out.println();
            }
        }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern16.pattern(rows);
        sc.close();
    }
}
