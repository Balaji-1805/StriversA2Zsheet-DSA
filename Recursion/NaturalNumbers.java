import java.util.*;
class NaturalNumbers
{
    // recursive function for sum of natural numbers
    static int sumOfNaturalNumbers(int num)
    {
        if(num==1) return 1;
        return num + sumOfNaturalNumbers(num-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();       
        System.out.println("Sum of Natural Numbers:"+NaturalNumbers.sumOfNaturalNumbers(num));
        sc.close();
    }
}