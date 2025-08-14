import java.util.Scanner;

class Pattern7
{
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
              System.out.print(" ");  
            
            }
              for(int k=1;k<=2*(i-1)+1;k++)
                {
                    System.out.print("*");
                }
             for(int j=i;j<n;j++)
            {
              System.out.print(" ");  
            
            }
                System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern7.pattern(rows);
        sc.close();
    }
}