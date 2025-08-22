// Check number is palindrome or not
import java.util.Scanner;
public class Palindrome {

    static boolean isPalindrome(int num)
    {
        int rev=0;
        int original=num;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev==original;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number=sc.nextInt();
        System.out.println((Palindrome.isPalindrome(number))?"Given number is Palidrome":"Given number is not Palindrome");
        sc.close();
    }
}
