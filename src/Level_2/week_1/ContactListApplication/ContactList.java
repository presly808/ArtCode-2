package Level_2.week_1.ContactListApplication;

/**
 * Created by pc on 08.08.2016.
 */
public class ContactList {

    private Contact[] contactList;
    private int busyPlaces;

    public void createContactList(){
        contactList = new Contact[100];
    }

    public boolean addContact(Contact contact){
        expandContactList();
        boolean result = false;
        if (contactValidation(contact)) {
            if (checkUniqueName(contact)) {
                for (int i = 0; i < contactList.length; i++) {
                    if (contactList[i] == null) {
                        contactList[i] = contact;
                        busyPlaces++;
                        result = true;
                        break;
                    }
                }
            } else
                System.out.println(contact.getName() + " not unique");
                result = false;
        } else {
            System.out.println("Wrong validation for contact with name : " + contact.getName());
            result = false;

        }
        return result;
    }

    public boolean removeContact(String contactName){

        boolean result = false;
        if (checkPresentContactInContactList()) {
            int contactPosition = findContactPositionInContactList(contactName);
            contactList[contactPosition] = null;
            result = true;
            busyPlaces--;
            for (int i = contactPosition; i < contactList.length; i++) {
                if (i < contactList.length - 1) {
                    contactList[i] = contactList[i + 1];
                }
            }
        }
        return result;
    }

    // update name for contact
    public boolean updateContactInfo(String contactName, String newContactData){

        boolean result = false;
        if (contactValidation(newContactData)) {
            int contactPosition = findContactPositionInContactList(contactName);
            if (contactPosition != -1) {
                contactList[contactPosition].setName(newContactData);
                result = true;
            } else {
                System.out.println("contact with name: " + contactName + " doesn`t exist");
                result = false;
            }
        }
        return result;
    }

    public boolean checkUniqueName(Contact contact){
        boolean uniqueNameResult = false;

        if (checkPresentContactInContactList()) {

            for (int i = 0; i < busyPlaces; i++) {
                    if (contactList[i].getName() == contact.getName()) {
                        uniqueNameResult = false;
                        break;
                    } else {
                        uniqueNameResult = true;
                    }
                }

            } else {
                uniqueNameResult = true;
            }
        return uniqueNameResult;
    }

    // find contact position in Contact list by contact name
    public int findContactPositionInContactList(String contactName) {

        int i = 0;
        if (checkPresentContactInContactList()) {
            for (i = 0; i < contactList.length; i++) {
                if (contactList[i].getName() == contactName) {
                    return i;
                }
            }
            if (i == 0) {
                return -1;
            }
        }
        return i;
    }

    // find and show contact info by contact name
    public String findContactInContactList(String contactName) {
        if (checkPresentContactInContactList()) {

            for (int i = 0; i < contactList.length; i++)
                return contactList[i].getName() == contactName ? contactList[i].toString() : "contact doesn`t exist";
            }
        return "contact doesn`t exist";
    }

    public boolean checkPresentContactInContactList(){
        int counter = 0;
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] != null) {
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.println("contact list empty");
            return false;
        } else
            return true;
    }

    public void expandContactList(){
        if (busyPlaces >= contactList.length) {
            System.out.println("need to expand contact list");
            Contact[] newContactList = new Contact[contactList.length * 2];
            System.arraycopy(contactList, 0, newContactList, 0, contactList.length);
            contactList = newContactList;
        }
    }

    public String showLastFiveContacts(){

        String resultContacts = "";
        int counter = 0;

        for (int i = 0; i < contactList.length; i++) {

            int lastPosition = contactList.length - i - 1;
            if (contactList[lastPosition] == null) {
                i++;
            } else {
                resultContacts += contactList[lastPosition].toString() + "\n";
                counter++;
                if (counter == 5) {
                    resultContacts += " " + contactList[i].toString() + "\n";
                } else {
                    if (counter < 5 && i == lastPosition) {
                        resultContacts = "contactList contains less than 5 contacts: \n" + resultContacts;
                    }
                }
            }
        }
        return resultContacts;
    }

    public String showFirstFiveContacts(){

        String resultContacts = "";
        for (int i = 0; i < 5; i++) {

            if (contactList[i] == null) {
                resultContacts += " contact not exist \n";
            } else {
                resultContacts += " " + contactList[i].toString() + "\n";
            }
        }
        return resultContacts;
    }

    public String showALLContacts(){

        String resultContacts = "";
        for (int i = 0; i < busyPlaces; i++) {
            if (contactList[i] == null) {
                resultContacts += " contact not exist \n";
            } else {
                resultContacts += " " + contactList[i].toString() + "\n";
            }
        }
        return resultContacts;
    }

    public String showLifeContacts(){
        String result = "";
        for (int j = 0; j < busyPlaces; j++) {
            if (contactList[j].getOperator() == "LIFE") {
                result += contactList[j].toString() + " \n";
            }
        }
        return result;
    }

    public String showKievstarContacts(){
        String result = "";
        for (int j = 0; j < busyPlaces; j++) {
            if (contactList[j].getOperator() == "KIEVSTAR") {
                result += contactList[j].toString() + " \n";
            }
        }
        return result;
    }

    // check validation for contact name and  contact surname
    public boolean contactValidation(Contact contact){
        return (contact.getName() == null || contact.getSurname() == null) ? false :
                (!contact.getName().matches("^\\D*$")) || (!contact.getSurname().matches("^\\D*$")) ? false  : true;
    }

    // check all symbols 7sdf463dfg276
    public boolean contactValidation(String contactName){
        return (contactName == null) ? false : !(contactName.matches("^\\D*$")) ? false : true;
    }
}
