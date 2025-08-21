import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        String name="aabbccddeffer";
        name=name.toLowerCase();
        // ArrayList<String> arr=new ArrayList<>(Arrays.asList(name.split("")));
        HashMap<Character,Integer> count=new HashMap<>();
        for(int i=0;i<name.length();i++)
        {

            Character ch=name.charAt(i);
            if(ch!=' ')
            {count.put(ch,count.getOrDefault(ch, 0)+1);}

        }
        System.out.println("Frequency of String:"+count);
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if(count.get(ch)<2)
            {
                System.out.println("First non repeating character:"+ch);
                break;
            }
        }
    }
}
