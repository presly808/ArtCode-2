package Level_2.week_1.ContactListApplication;

/**
 * Created by pc on 08.08.2016.
 */
public class ContactList {

    private Contact[] contactList;
    private int busyPlaces;

    private static final String LIFE = "LIFE";
    private static final String KIEVSTAR = "KIEVSTAR";

    public void createContactList(){
        contactList = new Contact[100];
    }

    public boolean addContact(Contact contact){
        if (contactValidation(contact)) {
            if (checkUniqueName(contact)) {
                expandContactList();
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
                System.arraycopy(contactList, contactPosition + 1, contactList, contactPosition, contactList.length - (contactPosition + 1));
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
        if (findContactPositionInContactList(contact.getName()) == -1) {
            return true;
            }
        return false;
    }

    public boolean checkUniqueName(String contactName){
        if (findContactPositionInContactList(contactName) == -1) {
            return true;
        }
        return false;
    }

    // find contact position in Contact list by contact name
    public int findContactPositionInContactList(String contactName) {
        if (busyPlaces > 0) {
            for (int i = 0; i < busyPlaces; i++) {
                if (contactList[i].getName() == contactName) {
                    return i;
                }
            }
        }
        return -1;
    }

    // find and show contact info by contact name
    public String findAndShowContactInContactList(String contactName) {
        if (busyPlaces > 0) {
            for (int i = 0; i < busyPlaces; i++)
                return contactList[i].getName() == contactName ? contactList[i].toString() : "contact doesn`t exist";
            }
        return "contact doesn`t exist";
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

    public String showALLContactList(){
        StringBuilder resultContacts = new StringBuilder();
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] != null) {
                resultContacts.append(" " + i + "| "+ contactList[i].toString() + "\n");
            } else {
                resultContacts.append(i + "| contact not exist \n");
            }
        }
        return resultContacts.toString().trim();
    }

    public StringBuilder showContactsByOperator(String operator){
        StringBuilder result = new StringBuilder("");

        if (operator == LIFE) {
            for (int j = 0; j < busyPlaces; j++) {
                if (contactList[j].getOperator() == LIFE) {
                    result.append(contactList[j].toString() + " \n");
                }
            }
        } else {
            if (operator == KIEVSTAR) {
                for (int j = 0; j < busyPlaces; j++) {
                    if (contactList[j].getOperator() == KIEVSTAR) {
                        result.append(contactList[j].toString() + " \n");
                    }
                }
            } else {
                result.append("not exist");
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
        if (value <= contactList.length && value > 0) {
            return true;
        }
        System.out.println(value + " is incorrect");
        return false;
    }
}
