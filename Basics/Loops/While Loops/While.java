//While loops are used to iterate a specific block of code repeatedly until a condition is met
/*
A while loop follows a simple sequence of steps:
Evaluation of Test Expression: The loop begins by evaluating a test expression.
Condition Check: If the test expression is true, the code inside the loop's body is executed.
Re-evaluation: After executing the code, the test expression is evaluated again.
Continuation or Termination: This process continues until the test expression becomes false, at which point the while loop terminates.
*/
public class While {
    public static void main(String[] args) {
        int n=1;//Evaluation Check
        while(n<=10) //condition check
        {
            System.out.println(n);
            n++;//incrementing or decrementing
        }
    }
}

/*The only difference between for and while loop is
for is based on no of iterations and while based on condition
*/
