//Do while first executes the code and then checks for the condition 
//Even the condition wrong do while executes the block of code atleast once
public class DoWhile {
    public static void main(String[] args) {
        int n=12;//evaluation
        do
        {
            System.out.println(n);
            n++;//incrementing or decrementing
        }while(n<10);//even the condition wrong it executes block of code once
    }
}

/*
The Only difference while and do while is while checks the condition before executing
Whereas do-while checks the condition after executing the block of code atleast once.
 */