import java.util.Scanner;
public class Pattern11 {
     public static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            int num=1;
            if(i%2==0) num=1;
            else num=0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(num);
                num=1-num;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
        Pattern11.pattern(rows);
        sc.close();
    }
}
