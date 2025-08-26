import java.util.Scanner;
public class Factorial {
    static int fact=1;
    static int factorial(int i,int num)
    {
        if(i>num) return fact;
        fact*=i;
        return factorial(i+1, num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        System.out.println(factorial(1,num));
        sc.close();
    }
}
