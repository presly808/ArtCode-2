package Level_2.week_1.university;

/**
 * Created by pc on 09.08.2016.
 */
public class Student {

    private String name;
    private Address address;
    private double value;

    private Subject[] subject;

    public Student(String name, Address address, double value) {
        this.name = name;
        this.address = address;
        this.value = value;
    }

    public String toString(){
        return String.format("name : %s, address : %s", name, address.toString());
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public double getValue() {
        return value;
    }

    public Subject[] getSubject() {
        return subject;
    }

    public void learning(Subject subject1){

    }

    public boolean addSubject(){
        return false;
    }

    public boolean deleteSubjectFromList(String name){
        return false;
    }

    public String showAllInfoAboutSubject(){
        return "";
    }

    public double middleValueForAllSubjects(){
        return 0;
    }


}
