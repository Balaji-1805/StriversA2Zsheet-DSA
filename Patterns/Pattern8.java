import java.util.Scanner;

public class Pattern8 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i-1;j>=1;j--)
            {
              System.out.print("-");  
            
            }
              for(int k=2*(n-i)+1;k>=1;k--)
                {
                    System.out.print("*");
                }
            for(int j=i-1;j>=1;j--)
            {
              System.out.print("-");  
            
            }
                System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern8.pattern(rows);
        sc.close();
    }
}
