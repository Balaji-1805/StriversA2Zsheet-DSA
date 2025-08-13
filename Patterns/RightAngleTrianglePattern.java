import java.util.Scanner;

public class RightAngleTrianglePattern {
    public static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        RightAngleTrianglePattern.pattern(rows);
        sc.close();
    }
}
