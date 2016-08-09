package Level_2.week_1.university;

/**
 * Created by pc on 09.08.2016.
 */
public class Subject {

    private String name;
    private SemesterHours semesterHours;
    private int studentHours;
    private double value;

    public void init(String name, SemesterHours semesterHours, int studentHours, double value){
        this.name = name;
        this.semesterHours = semesterHours;
        this.studentHours = studentHours;
        this.value = value;
    }

    public String toString(){
        return String.format("subject : %s, hours in semester : %s, student hours : %d, valuation : %2f",
                name, semesterHours.toString(), studentHours, value);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemesterHours(SemesterHours semesterHours) {
        this.semesterHours = semesterHours;
    }

    public void setStudentHours(int studentHours) {
        this.studentHours = studentHours;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {

        return name;
    }

    public SemesterHours getSemesterHours() {
        return semesterHours;
    }

    public int getStudentHours() {
        return studentHours;
    }

    public double getValue() {
        return value;
    }

    // need to check if user pass exam
    public boolean passExamination(){
        return false;
    }

    //
    public String showSubjectInfo(){
        return null;
    }

    public double showStudentValue(Student student){
        return 0;
    }

}
