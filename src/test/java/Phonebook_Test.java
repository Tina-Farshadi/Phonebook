import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
/**
 * writing unit tests for each method of classes
 * If you have no idea about how to write unit tests, you can search the internet or check your first assignment
 * After each unit test you've written, please commit the changes and push to your repo

 * Hint: Your test coverage should be 100%
 * Attention:  We would check your commits and it will affect your score
 */

public class Phonebook_Test {
    final ArrayList<Person> contacts;

    public Phonebook_Test() {
        this.contacts = new ArrayList<>();
    }

    @Test
    void getAllContacts_test(){

        Person person=new Person("Tina","09123456789");
        Person person1=new Person("Tara","0");
        Person person2=new Person("T","09129388787");
        Phonebook phonebook=new Phonebook();
        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        contacts.add(person);
        contacts.add(person2);
        assertEquals(contacts,phonebook.getAllContacts());
    }

    @Test
    void getPhoneNumber_test(){
        Person person=new Person("Tina","09123456789");
        Person person1=new Person("Tara","0");
        Phonebook phonebook=new Phonebook();
        phonebook.addContact(person);
        phonebook.addContact(person1);
        assertEquals("09123456789",phonebook.getPhoneNumber("Tina"));
        assertEquals("Contact Not Found",phonebook.getPhoneNumber("Tara"));
    }


}
