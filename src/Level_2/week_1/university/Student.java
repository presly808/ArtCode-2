package Level_2.week_1.university;

/**
 * Created by pc on 09.08.2016.
 */
public class Student {

    private Subject[] subjectList;

    private String name;
    private Address address;
    private int subjectQuantity;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
        subjectList = new Subject[10];
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

    public Subject[] getSubject() {
        return subjectList;
    }

    public void learning(Subject subject){
        int hours = subject.getStudentHours();
        int subjectHours = (int) subject.getSemesterHours().getHours();
        while (hours < subjectHours){
            hours += 1;
        }
        subject.setStudentHours(hours);
        subject.setStudentValue(subject.generateStudentValue());
    }

    public boolean addSubject(Subject subject){
        int freePlace = findFreePlace();
        subjectList[freePlace] = subject;
        subjectQuantity++;
        return true;
    }

    public boolean removeLastSubject(){
        if (findLastSubject() != -1) {
            subjectList[findLastSubject()] = null;
            subjectQuantity--;
            return true;
        }
        System.out.println("no subject to delete");
        return false;
    }

    public String showAllInfoAboutSubjects(){
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < subjectQuantity; i++) {
            st.append(i + "| " + subjectList[i].toString() + "\n");
        }
        return st.toString();
    }

    public double getGPA(){
        if (subjectQuantity == 0) {
            double gpa = 0;
            for (int i = 0; i < subjectQuantity - 1; i++) {
                gpa += subjectList[i].getStudentValue();
            }
            return gpa / subjectQuantity;
        }
        System.out.println("not available subject");
        return -1;
    }

    public void expandSubjectList(){
        if (subjectQuantity >= subjectList.length){
            Subject[] newStudentList = new Subject[subjectList.length * 2];
            System.arraycopy(subjectList, 0, newStudentList, 0, subjectList.length);
            subjectList = newStudentList;;
        }
    }

    public int findFreePlace(){
        expandSubjectList();
        for (int i = 0; i < subjectList.length; i++) {
            if (subjectList[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int findLastSubject(){
        if (subjectQuantity > 0) {
            return subjectQuantity - 1;
        }
        return -1;
    }






}
