package Level_2.week_1.university;

/**
 * Created by pc on 09.08.2016.
 */
public class Student {

    private String name;
    private Address address;

    Subject[] subject;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return String.format("name : %s, address : %s", name, address.toString());
    }
}
