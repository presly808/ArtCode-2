package Level_2.week_1.contactListApplication;

/**
 * Created by pc on 08.08.2016.
 */
public class Contact {

    private String name;
    private String surname;
    private String phoneNumber;
    private Address address;
    private String operator;

    public void init(String name, String surname, String phoneNumber, Address address, String operator){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.operator = operator;
    }

    public String toString(){
        return String.format("contact name : %s, contact surname : %s, contact phone number : %s, contact Address : %s, operator : %s",
                name, surname, phoneNumber, address.toString(), operator);
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getOperator(){
        return operator;
    }

    public void setName(String name) {
        this.name = name;
    }

}
