import java.util.*;
public class SumofDigits {
    static int sumOfDigits(int num)
    {
        if(num/10==0) return num; //base case
        return (num%10) + sumOfDigits(num/10);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();       
        System.out.println("Sum of Digits :"+SumofDigits.sumOfDigits(num));
        sc.close();
    }
}
