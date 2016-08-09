package Level_2.week_1.ContactListApplication;

/**
 * Created by pc on 08.08.2016.
 */
public class ContactList {

    Contact[] contactList;

    private int contactPosition;
    private int busyPlaces;

    private String showFirstFiveContacts = "FIRST_FIVE";
    private String showLastFiveContacts = "LAST_FIVE";
    private String showALLContacts = "ALL";
    private String showLifeContacts = "LIFE";
    private String showKievstarContacts = "KIEVSTAR";

    public void createContactList(){
        contactList = new Contact[100];
    }

    public Contact[] addContact(Contact contact){
        expandContactList();
        if (contactValidation(contact) == true) {
            if (checkUniqueName(contact) == true) {
                for (int i = 0; i < contactList.length; i++) {
                    if (contactList[i] == null) {
                        contactList[i] = contact;
                        busyPlaces++;
                        break;
                    }
                }
            } else
                System.out.println(contact.getName() + " not unique");
        } else {
            System.out.println("Wrong validation for contact with name : " + contact.getName());
        }
        return contactList;
    }

    public Contact[] removeContact(String contactName){
        if (checkPresentContactInContactList() == true) {
            int contactPosition = findContactPositionInContactList(contactName);
                    contactList[contactPosition] = null;
                    if (contactPosition != contactList.length - 1) {
                        for (int j = contactPosition + 1; j < contactList.length; j++) {
                            if (contactList[j] != null) {
                                contactList[contactPosition] = contactList[j];
                            }
                        }
                    }
            busyPlaces--;
            System.out.println("contact with name : " + contactName + " removed");
        }
        return contactList;
    }

    // update name for contact
    public Contact[] updateContactInfo(String contactName, String newContactData){

        if (contactValidation(newContactData) == true) {
            int contactPosition = findContactPositionInContactList(contactName);
            contactList[contactPosition].setName(newContactData);
        }
        return contactList;
    }

    // update contact name to new contact name
//    public Contact[] updateContactInfo(int contactPosition, String newContactName){
//
//        if (contactValidation(newContactName) == true) {
//            for (int i = 0; i < contactList.length; i++) {
//                Contact con = contactList[contactPosition];
//                con.getName() = newContactName;
//            }
//        }
//        return contactList;
//    }

    public boolean checkUniqueName(Contact contact){
        boolean uniqueNameResult = false;

        if (checkPresentContactInContactList() == true) {

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

        int counter = 0;
        if (checkPresentContactInContactList() == true) {
            for (int i = 0; i < busyPlaces; i++) {
                String name = contactList[i].getName();
                if (name == contactName) {
                    contactPosition = i;
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println("contact with name: " + contactName + " doesn`t exist");
            }
        }
        return contactPosition;
    }

    // find and show contact info by contact name
    public String findContactInContactList(String contactName) {
        if (checkPresentContactInContactList() == true) {

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

    /* return result depends on String number:
     can be: LAST_FIVE - return last five contacts
     FIRST_FIVE - return string with first five contacts
     ALL - return all Contacts list
    */
    public String showSomeContacts(String number){
        String resultContacts = "";
        int counter = 0;

        if (number == showLastFiveContacts) {

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

        } else {

            if (number == showFirstFiveContacts) {
                for (int i = 0; i < 5; i++) {

                    if (contactList[i] == null) {
                        resultContacts += " contact not exist \n";
                    } else {
                        resultContacts += " " + contactList[i].toString() + "\n";
                    }
                }
            } else {

                if (number == showALLContacts) {
                    for (int i = 0; i < busyPlaces; i++) {
                        if (contactList[i] == null) {
                            resultContacts += " contact not exist \n";
                        } else {
                            resultContacts += " " + contactList[i].toString() + "\n";
                        }
                    }
                }
            }
        }
        return resultContacts;
    }

    public String showContactsByOperator(String operator){
        String result = "";

            if (operator == showLifeContacts) {
                for (int j = 0; j < busyPlaces; j++) {
                    if (contactList[j].getOperator() == operator) {
                        result += contactList[j].toString() + " \n";
                    }
                 }
            } else {
                    if (operator == showKievstarContacts) {
                        for (int j = 0; j < busyPlaces; j++) {
                            if (contactList[j].getOperator() == operator) {
                                result += contactList[j].toString() + " \n";
                            }
                        }
                    }
                }

        if (result == "") {
            result = operator + " not exist";
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
