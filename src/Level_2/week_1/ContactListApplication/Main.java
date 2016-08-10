package Level_2.week_1.ContactListApplication;

/**
 * Created by oleksandr.maslovskyj on 09.08.2016.
 */
public class Main {

    public static void main(String[] args) {

        ContactList contactList = new ContactList();
        contactList.createContactList();

        Address address = new Address();
        address.init("Mury", 120, 41);

        Contact contact = new Contact();
        contact.init("nameFirst", "lastFirst", "065-613-54-51", address, "KIEVSTAR");

        Contact contact1 = new Contact();
        contact1.init("nameFirstA", "lastFirstA", "065-613-54-51", address, "KIEVSTAR");

        Contact contact2 = new Contact();
        contact2.init("nameFirstB", "lastFirstB", "065-613-54-51", address, "LIFE");

        Contact contact3 = new Contact();
        contact3.init("nameFirstC", "lastFirstC", "065-613-54-51", address, "MTC");

        contactList.addContact(contact);
        contactList.addContact(contact1);
        contactList.addContact(contact2);
        contactList.addContact(contact3);

        contactList.removeContact("nameFirstB");
        System.out.println(contactList.showALLContacts());

        //contactList.updateContactInfo("nameFirstA", "newNameForTest");
        //System.out.println(contactList.showALLContacts());

        //System.out.println(contactList.showLast(10));
    }
}
