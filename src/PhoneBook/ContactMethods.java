package PhoneBook;
import java.util.ArrayList;
public class ContactMethods {
    private ArrayList<Contact> contacts;
    public ContactMethods() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
    public boolean removeContact(String contact) {
        contacts.remove(contact);
        return false;
    }
    public Contact findContactByFirstName(String firstName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                return contact;
            }
        }
        return null;
    }
    public Contact findContactByLastName(String lastName) {
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;
    }
    public Contact findContactByPhoneNumber(String PhoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(PhoneNumber)) {
                return contact;
            }
        }
        return null;
    }
    public boolean EditContact(String firstName, String newfirstName, String newlastName, String newphoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                contact.setFirstName(newfirstName);
                contact.setLastName(newlastName);
                contact.setPhoneNumber(newphoneNumber);
                return true;
            }
        }
        return false;
    }
}
