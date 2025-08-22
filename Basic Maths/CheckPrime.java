// Checking give number is prime or not
import java.util.*;
public class CheckPrime {
    static boolean isPrime(int num)
    {
        // int count=0;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();
        System.out.println(CheckPrime.isPrime(num));
        sc.close();
    }
}
