public class Main {
    public static void main(String[] args) {

        ContactManager manager = new ContactManager();

        manager.addContact(new Contact("Shifa", "Khan", "9876543210",
                "shifa@gmail.com", "Mumbai", "Maharashtra"));

        manager.addContact(new Contact("Ayesha", "Ali", "9999999999",
                "ayesha@gmail.com", "Delhi", "Delhi"));

        manager.displaySortedContacts();
        manager.searchByCityOrState("Mumbai");
        manager.editContact("Shifa", "Khan", "1111111111");
        manager.deleteContact("Ayesha", "Ali");
    }
}
