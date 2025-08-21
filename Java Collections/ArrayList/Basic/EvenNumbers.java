import java.util.ArrayList;

class EvenNumbers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers=new ArrayList<>();
        int size=5;
        System.out.print("Even Numbers:");
        for(int i=1;i<size+1;i++)
        {
            numbers.add(i);
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("ArrayList:"+numbers);
        //Inserting element at index 2 without replacing existing elements
        //add(index,value)
        numbers.add(2,0);
        System.out.println("After Insertion:");
        System.out.println("ArrayList:"+numbers);
        //Removing element by value
        // By default it will remove by index remove(index value)
        //We need to remove like this remove(Object value)
        // For numbers we use Wrapper class Integer.valueOf(number)
        System.out.println("Removing 5 from numbers:");
        numbers.remove(Integer.valueOf(5));
        System.out.println("ArrayList:"+numbers);
    }
}