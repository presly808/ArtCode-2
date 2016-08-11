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
        if (contactValidation(contact)) {
            expandContactList();
            if (checkUniqueName(contact)) {
                contactList[busyPlaces++] = contact;
                return true;
            } else
                System.out.println(contact.getName() + " not unique");
                return false;
        } else {
            System.out.println("Wrong validation for contact with name : " + contact.getName());
            return false;

        }
    }

    public boolean removeContact(String contactName){
        int contactPosition = findContactPositionInContactList(contactName);
        if (contactPosition != -1) {
            contactList[contactPosition] = null;
            busyPlaces--;
            if (contactPosition != contactList.length - 1) {
                System.arraycopy(contactList, contactPosition + 1, contactList, contactPosition, contactPosition);
            }
            return true;
        }
        return false;
    }

    // update name for contact
    public boolean updateContactInfo(String contactName, String newContactData){
        if (contactValidation(newContactData)) {
            if (checkUniqueName(newContactData)) {
                int contactPosition = findContactPositionInContactList(contactName);
                if (contactPosition != -1) {
                    contactList[contactPosition].setName(newContactData);
                    return true;
                    }
                } else {
                System.out.println(newContactData + " not unique");
                return false;
                }
            } else {
            System.out.println("contact with name: " + contactName + " doesn`t exist");
            return false;
            }
        return false;
    }

    public boolean checkUniqueName(Contact contact){
        if (checkPresentContactInContactList()) {
            for (int i = 0; i < busyPlaces; i++) {
                    if (contactList[i].getName() == contact.getName()) {
                        return false;
                    }
                }
            }
        return true;
    }

    public boolean checkUniqueName(String contactName){
        if (checkPresentContactInContactList()) {
            for (int i = 0; i < busyPlaces; i++) {
                if (contactList[i].getName() == contactName) {
                    return false;
                }
            }
        }
        return true;
    }

    // find contact position in Contact list by contact name
    public int findContactPositionInContactList(String contactName) {
        if (checkPresentContactInContactList()) {
            for (int i = 0; i < contactList.length; i++) {
                if (contactList[i].getName() == contactName) {
                    return i;
                }
            }
        }
        return -1;
    }

    // find and show contact info by contact name
    public String findAndShowContactInContactList(String contactName) {
        if (checkPresentContactInContactList()) {

            for (int i = 0; i < busyPlaces; i++)
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

    public String showLast(int valueToShow){

        StringBuilder resultContacts = new StringBuilder();
        int counter = 0;

        if (parameterValidation(valueToShow)) {
            for (int i = busyPlaces - 1; i >= 0; i--) {
                if (contactList[i] == null) {
                    i--;
                } else {
                    resultContacts.append(" " + i + "| " + contactList[i].toString() + "\n");
                    counter++;
                    if (counter == valueToShow) {
                        resultContacts.append(" " + i + "| " + contactList[i].toString() + "\n");
                    } else {
                        if (counter < valueToShow && i == 0) {
                            resultContacts.append("contactList contains less than" + valueToShow + " contacts: \n" + resultContacts);
                        }
                    }
                }

            }
        }
        return resultContacts.toString();
    }

    public String showFirst(int valueToShow){
        StringBuilder resultContacts = new StringBuilder();

        if (parameterValidation(valueToShow)) {
            for (int i = 0; i <= valueToShow; i++) {

                if (contactList[i] == null) {
                    resultContacts.append(" contact not exist \n");
                } else {
                    resultContacts.append(" " + i + "| " + contactList[i].toString() + "\n");
                }
            }
        }
        return resultContacts.toString();
    }

    public String showALLContacts(){
        StringBuilder resultContacts = new StringBuilder();
        for (int i = 0; i <= busyPlaces; i++) {
            if (contactList[i] != null) {
                resultContacts.append(" " + i + "| "+ contactList[i].toString() + "\n");
            } else {
                resultContacts.append(" contact not exist \n");
            }
        }
        return resultContacts.toString();
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

    public boolean contactValidation(Contact contact){
        return (contact.getName() == null || contact.getSurname() == null) ? false :
                (!contact.getName().matches("^\\D*$")) || (!contact.getSurname().matches("^\\D*$")) ? false  : true;
    }

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
