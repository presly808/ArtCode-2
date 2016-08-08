package Level_2.week_1.ContactListApplication;

/**
 * Created by pc on 08.08.2016.
 */
public class ContactList {

    Contact[] contactList;

    private int contactPosition;
    private boolean uniqueNameResult;
    private int busyPlaces;

    private String showFirstFiveContacts = "FIRST_FIVE";
    private String showAllFiveContacts = "LAST_FIVE";
    private String showALLContacts = "ALL";
    private String showLifeContacts = "LIFE";
    private String showKievstarContacts = "KIEVSTAR";

    public void createContactList(){
        contactList = new Contact[100];
    }

    public Contact[] addContact(Contact contact){
        expandContactList();
        if (uniqueNameResult == true) {
            for (int i = 0; i < contactList.length; i++) {
                if (contactList[i] == null) {
                    contactList[i] = contact;
                    busyPlaces++;
                }
            }
        }
        return contactList;
    }

    public Contact[] removeContact(Contact contact){
        if (checkPresentContactInContactList() == true) {
            int contactPosition = findContactPositionInContactList(contact);
            for (int i = 0; i < contactList.length; i++) {
                if (i == contactPosition) {
                    contactList[i] = null;
                    if (i != contactList.length - 1) {
                        Contact tmp = contactList[i];
                        contactList[i] = contactList[contactList.length - 1];
                        contactList[contactList.length - 1] = tmp;
                    }
                }
                
            }
        }
        return contactList;
    }

    public boolean checkUniqueName(Contact contact){
        if (checkPresentContactInContactList() == true) {
            for (int i = 0; i < contactList.length; i++) {
                if (contactList[i].getName() == contact.getName()) {
                    uniqueNameResult = false;
                } else {
                    uniqueNameResult = true;
                }
            }
        }
        return uniqueNameResult;
    }

    public int findContactPositionInContactList(Contact contact) {
        if (checkPresentContactInContactList() == true) {
            for (int i = 0; i < contactList.length; i++) {
                if (contactList[i].getName() == contact.getName()) {
                    contactPosition = i;
                } else {
                    System.out.println("contact doesn`t exist");
                }
            }
        }
        return contactPosition;
    }

    public String findContact(Contact contact){
        int contactPosition = findContactPositionInContactList(contact);
        return "contact position is : " + contactPosition + contact.toString();
    }

    public boolean checkPresentContactInContactList(){
        if (contactList == null) {
            System.out.println("Contact list empty");
            return false;
        } else
            return true;
    }

    public void expandContactList(){
        if (busyPlaces >= contactList.length) {
            Contact[] newContactList = new Contact[contactList.length * 2];
            System.arraycopy(contactList, 0, newContactList, 0, contactList.length);
            contactList = newContactList;
        }
    }

    /* return result depends on String number:
     can be: LAST_FIVE - return last five contacts
     FIRST_FIVE - return string with first five contacts
     ALL - return all Contacts list
    */
    public String showSomeContacts(String number){
        String resultContacts = "";
        int counter = 0;

        if (number == "LAST_FIVE") {

            for (int i = 0; i < contactList.length; i++) {

                int lastPosition = contactList.length - i - 1;
                if (contactList[lastPosition] == null) {
                    i++;
                } else {
                    resultContacts +="position : " + contactPosition + " " + contactList[lastPosition].toString() + "\n";
                    counter++;
                }
                return counter == 5 ? resultContacts : "contactList contains less than 5 contacts: \n" + resultContacts;
            }

        } else {

            if (number == "FIRST_FIVE") {
                for (int i = 0; i < 5; i++) {
                    resultContacts +="position : " + contactPosition + " " + contactList[i].toString() + "\n";
                }
            } else {

                if (number == "ALL") {
                    for (int i = 0; i < contactList.length; i++) {
                        resultContacts +="position : " + contactPosition + " " + contactList[i].toString() + "\n";
                    }
                }
            }
        }
        return resultContacts;
    }

    public String showContactsByOperator(String operator){
        String result = "";
        return result;
    }


}
