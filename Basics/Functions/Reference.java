//Call by Reference
//Value will be modified in entire class
public class Reference {
    public static void reference(int[] arr)
    {
        arr[4]=0;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Before Calling:"+arr[4]);//5
        Reference.reference(arr);
        System.out.println("After Calling:"+arr[4]);//0
        //Value is overidden due to passing reference of variable
        //By passing reference we are changing its actual value so it will be changed in memory
        //If we try to access we get the updated value at the reference
    }
}
