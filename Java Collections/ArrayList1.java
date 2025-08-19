import java.util.*;
class ArrayList1
{
    public static void main(String[] args) {
        //Arrays are fixed size
        //ArrayLists are dynamic can grow or shrinks
        List<Integer> numbers=new ArrayList<>();
        //add(value)-->method is used to insert elements end of the array
        numbers.add(0);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        System.out.println(numbers);
        //some methods
        System.out.println("Size of the array:"+numbers.size());//returns no of elements in array
        System.out.println("Is Array Empty?:"+numbers.isEmpty());//returns true if array is empty otherwise false
        System.out.println("Is 2 contains in array?:"+numbers.contains(2));
        //to update a particular element in array we use:set(index,updateValue)
        numbers.set(2,0);
        System.out.println("Updated Array:"+numbers);
        //To remove element from array we use remove method in 2 ways
        //1st way remove by value:remove(element) for non integer data;
        //2nd way remove by index postition:remove(index_number)
        numbers.remove(0);
        System.out.println("Numbers:"+numbers);
        //Sorting
        Collections.sort(numbers);
        System.out.println("After Sorting:"+numbers);
        //Reverse Order Sorting/Decreasing order
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println("Reverse Sorting:"+numbers);
        //To clear data in array without clearing space allocation we use clear() method
        numbers.clear();
        System.out.println(numbers);
    }

}