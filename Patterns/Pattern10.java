import java.util.Scanner;
public class Pattern10 {
    public static void pattern(int n)
    {

        for(int i=1;i<=2*n-1;i++)
        {
            int stars=(i<=n)?i:2*n-i; 
            for(int j=1;j<=stars;j++)
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
        Pattern10.pattern(rows);
        sc.close();
    }

}
