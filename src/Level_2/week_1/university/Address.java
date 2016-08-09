package Level_2.week_1.university;

/**
 * Created by pc on 09.08.2016.
 */
public class Address {

    private String city;
    private String street;
    private int buildNumber;
    private int flatNumber;

    public Address(String city, String street, int buildNumber, int flatNumber) {
        this.city = city;
        this.street = street;
        this.buildNumber = buildNumber;
        this.flatNumber = flatNumber;
    }

    public String toString(){
        return String.format("city : %s, street : %s, building : %d, flat : %d",
                city, street, buildNumber, flatNumber);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getCity() {

        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }
}
