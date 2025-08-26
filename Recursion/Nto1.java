// Prints N to 1 using recursion
public class Nto1 {
    static void func(int n, int a)
    {
        if(n<a) return;
        System.out.println(n);
        func(n-1,a);
    }
    public static void main(String[] args) {
        int a=1;
        int n=10;
        func(n,a);
    }
}
