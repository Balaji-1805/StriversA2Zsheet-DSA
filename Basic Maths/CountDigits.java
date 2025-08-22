//Find no of digits in a given Integer

import java.util.Scanner;

class CountDigits
{
    public static int countDigits(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();
        //1st approach
        // String s=Integer.toString(num);
        // System.out.println("No of Digits:"+s.length());
        //2nd approach
        // int digits=CountDigits.countDigits(num);
        // System.out.println("No of Digits:"+digits);
        int count=(int) (Math.log10(num)+1);
        System.out.println("No of Digits:"+count);
        sc.close();

    }
}