//Functions are used to perform a specific task and returns result to the caller
//Call by value
public class Function {
    public static int add(int a,int b)
    {
        a=20;
        b=30;
        return a+b;
    }
    public static void main(String[] args) {
        int a=10,b=20;
        int result=Function.add(a,b);
        //Values not changed
        System.out.println(a+" "+b);
        System.out.println("Result:"+result);
    }
}
