import java.util.*;
class StudentData
{
    public static void main(String[] args) {
        // HashMap is used to store key value pair data
        // Keys are unique but values can duplicate
        // Each key maps to a single value 
        HashMap<String,Integer> studentMarks=new HashMap<>();
        String student=null;
        studentMarks.put("Balaji",99);
        studentMarks.put("Gojo",93);
        studentMarks.put("Sukuna",92);
        System.out.println("Student Marks:"+studentMarks);
        System.out.println("Student Names:"+studentMarks.keySet()); //list of keys
        System.out.println("Student Marks:"+studentMarks.values()); //list of values
        int highestMarks=Integer.MIN_VALUE;
        for(String name:studentMarks.keySet())
        {
            int marks=studentMarks.get(name);
            if(marks>highestMarks)
            {
                highestMarks=marks;
                student=name;
            }
        }
        System.out.println("Student Name:"+student  +" "+"Highest Marks:"+highestMarks);
        // Updating marks of students by 10
        for(String name:studentMarks.keySet())
        {
            studentMarks.put(name,studentMarks.get(name)+10);
        }
        System.out.println("Student Data:"+studentMarks);
    }
}