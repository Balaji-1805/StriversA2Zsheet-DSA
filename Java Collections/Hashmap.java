import java.util.*;
import java.util.Scanner;

class Hashmap
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Hashmap in java is used to store key value pairs
        // Hashmap is fast access and unordered
        HashMap<String,String> studentData=new HashMap<>();
        studentData.put("B1","Balaji Uggina");
        studentData.put("B2","RaviTeja Uggina");
        studentData.put("B3","JayaRam Uggina");
        studentData.put("B4","Goutham Uggina");
        System.out.println(studentData);
        System.out.println(studentData.isEmpty());
        System.out.println(studentData.size());
        System.out.println("Keys:"+studentData.keySet());
        System.out.println("Values:"+studentData.values());
        studentData.remove("B1");
        System.out.println(studentData);
        System.out.println(studentData.containsKey("B1"));
        
        
        



    }
}