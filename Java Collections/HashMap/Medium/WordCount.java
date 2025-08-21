import java.util.*;
public class WordCount {

    public static void main(String[] args) {
        String name="This is for Testing";
        name=name.toLowerCase();
        String[] words=name.split(" ");
        ArrayList<String> arr=new ArrayList<>(Arrays.asList(words));
        System.out.println(arr);
        HashMap<String,Integer> wordFrequency=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {

            String word=words[i];
            wordFrequency.put(word,wordFrequency.getOrDefault(word, 0)+1);

        }
        System.out.println("Frequency of String:"+wordFrequency);
    }

}
