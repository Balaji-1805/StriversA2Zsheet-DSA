import java.util.HashMap;

public class PhoneDirectory {
    public static void main(String[] args) {
        HashMap<String,Long> contacts=new HashMap<>();
        contacts.put("Balaji MCA",93477996L);
        contacts.put("Venkatesh MCA",9045399221L);
        contacts.put("Eswar MCA",8493283424L);
        for(String name:contacts.keySet())
        {
        System.out.println(name+"->"+contacts.get(name));
        }
        String name="Pravalika MCA";
        if(contacts.containsKey(name))
        {
            System.out.println(name+"->"+contacts.get(name));
        }
        else{
            System.out.println("No contact found");
        }
    }
}
