//combination of pattern 7 and 8

import java.util.Scanner;

public class Pattern9 {
    public static void pattern(int n)
    {
         n=(n%2==0)?n/2:(n+1)/2;
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
        for(int i=1;i<=n;i++)
        {
            for(int j=i-1;j>=1;j--)
            {
              System.out.print(" ");  
            
            }
              for(int k=2*(n-i)+1;k>=1;k--)
                {
                    System.out.print("*");
                }
            for(int j=i-1;j>=1;j--)
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
        Pattern9.pattern(rows);
        sc.close();
    }
}
