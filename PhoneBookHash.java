import java.util.HashMap;
import java.util.Set;

public class PhoneBookHash {

    HashMap <Long, String> hash = new HashMap<>();

    public void addPhone(long number, String lastName ) {
        this.hash.put(number, lastName);
    }

    public void getPhone(String lastName) {
        Set<HashMap.Entry<Long, String>> set = hash.entrySet();
        System.out.println("номера по фамилии " + lastName + ": ");
        for (HashMap.Entry<Long, String> o : set)

            if(o.getValue() == lastName) {
                System.out.println(o.getKey());
            }
    }
}