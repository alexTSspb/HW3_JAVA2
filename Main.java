import java.util.*;

public class Main {
    private String[] Arr;
    private int size;
    public Random random = new Random();
    public Main(int size)
    {
        this.size = size;
        Arr = new String[size];
    }
     private void createArrStr()
    {
        for (int i = 0; i < size; i++)
        {
            Arr[i] = "Ivanov"+random.nextInt(8);
        }
    }
    static void firstWork(Main main)
    {
        main.createArrStr();
        HashMap<String, Integer> words = new HashMap<>();
        for(int i = 0; i < main.size; i++)
        {
            Integer res = words.get(main.Arr[i]);
            words.put(main.Arr[i], res == null ? 1 : res + 1);
        }
        Set<String> keys = words.keySet();
        System.out.println(keys);

        ArrayList<Integer> values = new ArrayList<>(words.values());
        System.out.println(values);

        System.out.println(words);
        int number = words.get(main.Arr[2]);
        System.out.println(main.Arr[2] + " встретился "+number + " раз");

    }

//    static void secondTreeSet()
//    {
//        PhoneBook book = new PhoneBook();
//        book.addContact(new Contact("Ivanov", 907555077));
//        book.addContact(new Contact("Sidorov", 907795566));
//        book.addContact(new Contact("Petov", 90776677));
//        book.addContact(new Contact("Alexanin", 806555557));
//        book.addContact(new Contact("Terehov", 456577777));
//        book.addContact(new Contact("Fortin", 333577777));
//        book.addContact(new Contact("Aledsanin", 446577777));
//        book.addContact(new Contact("Terecov", 909577777));
//
//       //long l = book.iterator.next().phoneNumber;
//
//
//
//
//
//    }

    public static void main(String[] args) {
        Main main = new Main(20);
        firstWork(main);
//        secondTreeSet();
        secondHashMap();


    }

    private static void secondHashMap() {
        PhoneBookHash book = new PhoneBookHash();
        book.addPhone(47678959999l,"Ivanov");
        book.addPhone(89118497991l,"Ivanov");
        book.addPhone(891184075999l,"Petrov");
        book.addPhone(891189076999l,"Petrov");
        book.addPhone(894564078880l,"Sidorov");
        book.addPhone(892184570888l,"Ivanov");
        book.addPhone(8905123678887l,"Sidorov");
        book.addPhone(8906845707l,"Terehov");
        book.getPhone("Ivanov");
        book.getPhone("Petrov");
        book.getPhone("Sidorov");
    }
}

