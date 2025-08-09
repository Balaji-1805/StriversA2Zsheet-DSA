//Primitive Data types:
//byte short int long float double boolean char
//Local variables cannot be accessed before initialization
class Primitive 
{
     byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        boolean g;
        char h;
    public static void main(String[] args) {
       
        Primitive obj=new Primitive();
        System.out.println("Default Value of byte:"+obj.a);//0
        System.out.println("Default Value of short:"+obj.b);//0
        System.out.println("Default Value of int:"+obj.c);//0
        System.out.println("Default Value of long:"+obj.d);//0
        System.out.println("Default Value of double:"+obj.e);//0.0
        System.out.println("Default Value of float:"+obj.f);//0.0
        System.out.println("Default Value of boolean:"+obj.g);//false
        System.out.println("Default Value of char:"+obj.h);//null
    }
}