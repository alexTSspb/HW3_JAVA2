public class Contact implements Comparable<Contact>{
    String lastName;
    long phoneNumber;

    Contact(String lastName, long phoneNumber)
    {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Contact o) {
        return lastName.compareTo(o.lastName);
    }
}
