//Full star pattern
import java.util.Scanner;
class PatternRow
{
    public static void pattern(int n) 
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of rows:");
        int rows=sc.nextInt();
        PatternRow.pattern(rows);
        sc.close();
        
    }
}