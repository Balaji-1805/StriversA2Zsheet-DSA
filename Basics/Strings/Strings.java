//In Java Strings are used to store collection of characters in Single variable enclosed by double quotes
//Strings are immutable,we can access them by index but not modify the characters by using index 
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name:");
        // String name=sc.next(); //next() is used to read single word 
        String name=sc.nextLine(); //next() is used to read multiple words seperated by spaces
        System.out.println("Your Name is :"+name);
        System.out.println(name.split(" ")[1]);
        sc.close();
    }
}
