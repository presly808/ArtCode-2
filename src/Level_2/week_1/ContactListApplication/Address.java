package Level_2.week_1.contactListApplication;

/**
 * Created by pc on 08.08.2016.
 */
public class Address {

    private String street;
    private int buildNumber;
    private int flatNumber;

    public void  init(String street, int buildNumber, int flatNumber){
        this.street = street;
        this.buildNumber = buildNumber;
        this.flatNumber = flatNumber;
    }

    public String toString(){
        return String.format("street : %s, building Number : %d, flat number : %d",
                street, buildNumber, flatNumber);
    }
}
