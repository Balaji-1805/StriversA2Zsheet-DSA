import java.util.Scanner;

public class Pattern14 {
    static void pattern(int n)
    {
            for(int i=0;i<n;i++)
            {
                char ch='A';// or we can use 65 in inner loop upto 65+i and print((char)j)  (type casting)
                for(int j=0;j<=i;j++)
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
        Pattern14.pattern(rows);
        sc.close();
    }
}
