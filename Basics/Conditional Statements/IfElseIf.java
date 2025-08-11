import java.util.Scanner;
public class IfElseIf {
    public static void main(String[] args) {
        char grade;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks:");
        int marks=sc.nextInt();
        if(marks<25){
            grade='F';
        }else if(marks<=44){
            grade='E';
        }else if(marks<=49){
            grade='D';
        }else if(marks<=59){
            grade='C';
        }else if(marks<=69){
            grade='B';
        }else if(marks>=70){
            grade='A';
        }
        else
        {
            grade='X';
        }
        System.out.println("Grade:"+grade);
        sc.close();
    }
}
