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
    Person person=new Person("Tina","09123456789");
    Person person1=new Person("Tara","0");
    Person person2=new Person("T","09129388787");
    Phonebook phonebook=new Phonebook();
    public Phonebook_Test() {
        this.contacts = new ArrayList<>();
    }

    @Test
    void getAllContacts_test(){
        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        contacts.add(person);
        contacts.add(person2);
        assertEquals(contacts,phonebook.getAllContacts());
    }

    @Test
    void getPhoneNumber_test(){
        phonebook.addContact(person);
        phonebook.addContact(person1);
        assertEquals("09123456789",phonebook.getPhoneNumber("Tina"));
        assertEquals("Contact Not Found",phonebook.getPhoneNumber("Tara"));
    }

    @Test
    void getContact_test(){
        phonebook.addContact(person);
        phonebook.addContact(person1);
        assertEquals(0,phonebook.getContact("Tara"));
        assertEquals(1,phonebook.getContact("Tina"));
    }

    @Test
    void updateContactName(){
        phonebook.addContact(person);
        phonebook.addContact(person1);
        assertEquals(0,phonebook.updateContactName("Tara","Sara"));
        assertEquals(1,phonebook.updateContactName("Tina","Alma"));
        assertEquals(0,phonebook.updateContactName("Tina","Tt"));
    }

    @Test
    void deleteContact_test(){
        phonebook.addContact(person);
        phonebook.addContact(person1);
        assertEquals(0,phonebook.deleteContact("Tara"));
        assertEquals(1,phonebook.deleteContact("Tina"));
        contacts.remove(person);
        assertEquals(contacts,phonebook.getAllContacts());
    }

    @Test
    void updateContactPhoneNumber_test(){
        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        assertEquals(0,phonebook.updateContactPhoneNumber("Tara","09999"));
        assertEquals(1,phonebook.updateContactPhoneNumber("Tina","09111122221"));
        assertEquals(1,phonebook.updateContactPhoneNumber("T","00"));
    }

    @Test
    void setAllContactsHiddenAndUnHidden_test(){

        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);

        phonebook.setAllContactsHidden();
        assertTrue(person.isHidden());
        assertFalse(person1.isHidden());
        assertTrue(person2.isHidden());

        phonebook.setAllContactsUnHidden();
        assertFalse(person.isHidden());
        assertFalse(person2.isHidden());
    }

    @Test
    void toString_test(){
        String tostring= "Name: "+"Tina"+" - Phone number: "+"09123456789";
        assertEquals(tostring,person.toString());
        assertEquals("Name: Tara - Phone number: null",person1.toString());
    }

    @Test
    void getId_test(){
        assertEquals(1,person.getId());
        assertEquals(2,person2.getId());
    }

}
