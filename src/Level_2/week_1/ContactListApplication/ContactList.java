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
                contactList[busyPlaces] = contact;
                busyPlaces++;
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
            // arraycopy
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
    public String findAndShowContactInContactList(String contactName) {
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

    public StringBuilder showLast(int valueToShow){
        StringBuilder resultContacts = new StringBuilder("");
        int counter = 0;

        if (parameterValidation(valueToShow)) {
            for (int i = 0; i < contactList.length; i++) {

                int lastPosition = contactList.length - i - 1;
                if (contactList[lastPosition] == null) {
                    i++;
                } else {
                    resultContacts.append(contactList[lastPosition].toString() + "\n");
                    counter++;
                    if (counter == valueToShow) {
                        resultContacts.append(contactList[i].toString() + "\n");
                    } else {
                        if (counter < valueToShow && i == lastPosition) {
                            resultContacts.append("contactList contains less than" + valueToShow + " contacts: \n" + resultContacts);
                        }
                    }
                }
            }
        }
        return resultContacts;
    }

    public StringBuilder showFirst(int valueToShow){
        StringBuilder resultContacts = new StringBuilder("");

        if (parameterValidation(valueToShow)) {
            for (int i = 0; i < valueToShow; i++) {

                if (contactList[i] == null) {
                    resultContacts.append(" contact not exist \n");
                } else {
                    resultContacts.append(" " + contactList[i].toString() + "\n");
                }
            }
        }
        return resultContacts;
    }

    public StringBuilder showALLContacts(){

        StringBuilder resultContacts = new StringBuilder("");
        for (int i = 0; i < busyPlaces; i++) {
            if (contactList[i] == null) {
                resultContacts.append(" contact not exist \n");
            } else {
                resultContacts.append(" " + contactList[i].toString() + "\n");
            }
        }
        return resultContacts;
    }

    public StringBuilder showLifeContacts(){
        StringBuilder result = new StringBuilder("");
        for (int j = 0; j < busyPlaces; j++) {
            if (contactList[j].getOperator() == "LIFE") {
                result.append(contactList[j].toString() + " \n");
            }
        }
        return result;
    }

    public StringBuilder showKievstarContacts(){
        StringBuilder result = new StringBuilder("");
        for (int j = 0; j < busyPlaces; j++) {
            if (contactList[j].getOperator() == "KIEVSTAR") {
                result.append(contactList[j].toString() + " \n");
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

    public boolean parameterValidation(int value){
        if (value > contactList.length) {
            System.out.println(value + " is very big");
            return false;
        }
        return true;
    }
}
