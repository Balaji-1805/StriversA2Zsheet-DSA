// Finding the frequency of the characters in a String
import java.util.*;
public class CharacterFreq {
    public static void main(String[] args) {
        String name="Balaji";
        name=name.toLowerCase();
        int hashArr[]=new int[26];
        // char arr[]=name.toCharArray();
        for(int i=0;i<name.length();i++)
        {
            hashArr[name.charAt(i)-'a']++;
        }
        HashSet<Character> seen=new HashSet<>();
        for(int i=0;i<name.length();i++)
        {
            if(seen.add(name.charAt(i)))
            System.out.println(name.charAt(i)+":"+hashArr[name.charAt(i)-'a']);
        }
        
    }
}

