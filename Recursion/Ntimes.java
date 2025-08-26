import java.util.Scanner;
public class Ntimes {

    static void func(int i,int n)
    {
        if(i>n) return;
        System.out.println(i+":"+"Balaji");
        func(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        func(1, 10);
        sc.close();
    }
}
