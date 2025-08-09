// To get input from user we use Scanner class with System.in
//To display message to the console we System.out.println("message") method
import java.util.Scanner;
class Input
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        System.out.println("Number is "+number);
        sc.close();
    }
}