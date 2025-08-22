// Divisors of a Number
import java.util.*;
public class Divisors {
    // 2nd Approach ==>O(sqrt(N)) time complexity
    static ArrayList<Integer> divisors(int num)
    {
        ArrayList<Integer> divisors=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                divisors.add(i);
                if(num/i!=i)
                {
                    divisors.add(num/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();
        // 1st approach
        // ArrayList<Integer> totalDivisors=new ArrayList<>();
        // 1st Approach ==>O(N) time complexity
        // for(int i=1;i<=num;i++)
        // {
        //     if(num%i==0)
        //     {
        //         totalDivisors.add(i);
        //     }
        // }
        // System.out.println("Total Divisors:"+totalDivisors);
        ArrayList<Integer> totalDivisors=Divisors.divisors(num);
        System.out.println("Total Divisors:"+totalDivisors);
        sc.close();
    }       
}
