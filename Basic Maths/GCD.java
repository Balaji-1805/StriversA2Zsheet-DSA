import java.util.Scanner;

public class GCD {
    //2nd approach
    // static int gcd(int a,int b)
    // {
    //     if(a==0) return b;
    //     else if(b==0) return a;
    //     int gcd=1;
    //    for(int i=1;i<=Math.min(a,b);i++)
    //    {
    //         if(a%i==0&&b%i==0&&i>gcd)
    //         {
    //             gcd=i;
    //         }
    //    }
    //    return gcd;
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //Euclidean Approach
        // while(b!=0)
        // {
        //     int rem=a%b;
        //     a=b;
        //     b=rem;
        // }
        // System.out.println("GCD:"+a);
        // System.out.println("GCD:"+GCD.gcd(a, b));
        int gcd=-1;
        while(a>0 && b>0)
        {
            if(a>b) a=a%b;
            else if(b>a) b=b%a;
        }
        if(a==0)  gcd=b;
        else if(b==0) gcd=a;
        System.out.println("GCD:"+gcd);
        sc.close();
    }
}
