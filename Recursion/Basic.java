// Printing 1 to n numbers

import java.util.Scanner;
public class Basic {
    static int a=1;
    static int printNumbers(int num)
    {
        if(a==num) return num;
        else{
            System.out.println(a);
            a++;
            return printNumbers(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        System.out.println("Output:");
        System.out.println(Basic.printNumbers(num));
        sc.close();
    }
}
