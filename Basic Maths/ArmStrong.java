// Check the number is ArmStrong number or not

import java.util.Scanner;
public class ArmStrong {
    // 1st approach
    // static int noOfDigits(int num)
    // {
    //     int count=0;
    //     while(num!=0)
    //     {
    //         num=num/10;
    //         count++;
    //     }
    //     return count;
    // }

    static boolean isArmStrong(int num)
    {
        int original=num;
        // int power=ArmStrong.noOfDigits(num);

        //2nd approach
        int power=Integer.toString(num).length();
        int res=0;
        while(num!=0)
        {
            res+=Math.pow(num%10,power);
            num=num/10;
        }
        return (original==res);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt();
        System.out.println(ArmStrong.isArmStrong(num)?"Number is ArmStrong":"Number is not ArmStrong");
        sc.close();
    }
}
