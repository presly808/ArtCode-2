package Level_2.week_1.contactListApplication;

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
        if (contactValidation(contact) != false) {
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

    // якщо повертати контакта, то потрібно contactPosition знаходити перед валідаціями, що не дуже прикольно. Плюс не бачу семсу щоб його повертати оскільки в нас всеріно є його
    // номер позиції, або новче імя за який ми можено до його звернутись
    public boolean updateContactInfo(String contactName, String newContactData){
        if (contactValidation(newContactData) != false) {
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
        if (checkUniqueName(contact.getName()) == true) {
            return true;
            }
        return false;
    }

    // два посуті перегружені методи, які юзаємо щоб перевірити наше імя.контакт унікальним
    public boolean checkUniqueName(String contactName){
        if (findContactPositionInContactList(contactName) == -1) {
            return true;
        }
        return false;
    }

    // find contact position in Contact list by contact name
    public int findContactPositionInContactList(String contactName) {
            for (int i = 0; i < busyPlaces; i++) {
                if (contactList[i].getName() == contactName) {
                    return i;
                }
            }
        return -1;
    }

    // не впевнений що даний метод взагалі потрібний, оскільки можна обійтись і без нього
    public Contact findContactInContactList(String contactName) {
        if (busyPlaces > 0) {
            for (int i = 0; i < busyPlaces; i++)
                return contactList[i].getName() == contactName ? contactList[i] : null;
            }
        return null;
    }

    public void expandContactList(){
        if (busyPlaces >= contactList.length) {
            System.out.println("need to expand contact list");
            Contact[] newContactList = new Contact[contactList.length * 2];
            System.arraycopy(contactList, 0, newContactList, 0, contactList.length);
            contactList = newContactList;
        }
    }

    // тут трохи не ясно, показувати останні N контактів з нашого списку, чи показувати останні N існуючих контактів з ношого списку, я думав останні існуючі, нащо нам показувати нал
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
            for (int i = 0; i < valueToShow; i++) {

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

        if (operator == "LIFE") {
            for (int j = 0; j < busyPlaces; j++) {
                if (contactList[j].getOperator() == "LIFE") {
                    result.append(contactList[j].toString() + " \n");
                }
            }
        } else {
            if (operator == "KIEVSTAR") {
                for (int j = 0; j < busyPlaces; j++) {
                    if (contactList[j].getOperator() == "KIEVSTAR") {
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
        if (0 < value && value <= contactList.length) {
            return true;
        }
        System.out.println(value + " is incorrect");
        return false;
    }
}
