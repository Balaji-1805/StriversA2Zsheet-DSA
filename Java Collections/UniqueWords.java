import java.util.LinkedHashSet;

public class UniqueWords {
    public static void main(String[] args) {
        String text="Hii, My name is Uggina Balaji. I am    currently learning web development And doing projects. I have Strong interest in Mern stack development,and i built full stack websites using react node mongodb and express";
        text=text.toLowerCase();

        String[] words=text.split("\\W+");
        LinkedHashSet<String> uniqueWords=new LinkedHashSet<>();
        for(String word:words)
        {
            if(!word.isEmpty())
            {
            word=word.substring(0,1).toUpperCase()+word.substring(1);
            uniqueWords.add(word);
            }

        }
        System.out.println("Unique Words:"+uniqueWords);
        System.out.println("Total Unique Words:"+uniqueWords.size());
        
    }
}
