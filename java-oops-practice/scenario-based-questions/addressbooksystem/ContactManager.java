import java.util.*;

class ContactManager {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add Contact with Duplicate Check
    public void addContact(Contact newContact) {
        if (contacts.contains(newContact)) {
            System.out.println("Contact already exists!");
        } else {
            contacts.add(newContact);
            System.out.println("Contact added successfully.");
        }
    }

    // Edit Contact by Name
    public void editContact(String firstName, String lastName, String newPhone) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName) &&
                c.getLastName().equalsIgnoreCase(lastName)) {
                c.setPhone(newPhone);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete Contact by Name
    public void deleteContact(String firstName, String lastName) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.getFirstName().equalsIgnoreCase(firstName) &&
                c.getLastName().equalsIgnoreCase(lastName)) {
                iterator.remove();
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Search by City or State
    public void searchByCityOrState(String value) {
        for (Contact c : contacts) {
            if (c.getCity().equalsIgnoreCase(value) ||
                c.getState().equalsIgnoreCase(value)) {
                displayContact(c);
            }
        }
    }

    // Display Sorted Contacts
    public void displaySortedContacts() {
        contacts.sort(Comparator.comparing(Contact::getFirstName)
                                 .thenComparing(Contact::getLastName));
        for (Contact c : contacts) {
            displayContact(c);
        }
    }

    private void displayContact(Contact c) {
        System.out.println(c.getFirstName() + " " + c.getLastName() +
                " | " + c.getPhone() +
                " | " + c.getCity() + ", " + c.getState());
    }
}
