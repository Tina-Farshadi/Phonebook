import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {
    private final ArrayList<Person> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Person contact) {
        if (!(contact.getPhone() == null)) {
            contacts.add(contact);
        } else {
            System.out.println("You are NOT a member as your PhoneNumber doesn't have Value");
        }
    }


    public String getPhoneNumber(String name) {
        for (Person contact : contacts) {
            if (Objects.equals(contact.getName(), name))
                return contact.getPhone();
        }
        return "Contact Not Found";

    }public int getContact(String name) {
        for (Person contact : contacts) {
            if (Objects.equals(contact.getName(), name)) {
                System.out.println(contact);
                return 1;
            }
        }
        return 0;
    }
    public int updateContactName(String name, String newName) {
        for (Person contact : contacts) {
                if (Objects.equals(contact.getName(), name)) {
                contact.setName(newName);
                return 1;
            }
        }
        return 0;
    }

    public int updateContactPhoneNumber(String name, String newPhone) {
        for (Person contact : contacts) {
             if (Objects.equals(contact.getName(), name)) {
                contact.setPhone(newPhone);
                return 1;}
        }
        return 0;
    }
    public int deleteContact(String name) {
        for (Person contact : contacts) {
            if (Objects.equals(contact.getName(), name)) {
                contacts.remove(contact);
                return 1;}
        }
        return 0;
    }
    public ArrayList<Person> getAllContacts() {
        return contacts;}

    public void setAllContactsHidden() {
        for (Person contact : contacts) {
            contact.setHidden();
        }
    }
    public void setAllContactsUnHidden() {
        for (Person contact : contacts) {
            contact.setUnHidden();
        }
    }
}
