// Reverse a Number
import java.util.*;
public class ReverseNumber {
    static int reverseNumber(int num)
    {
        int res=0;
        while(num!=0)
        {
            int rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();

        System.out.println("Reverse Number:"+ReverseNumber.reverseNumber(num));
        sc.close();
    }
}
