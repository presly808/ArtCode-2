package Level_2.week_1.university;

/**
 * Created by pc on 09.08.2016.
 */
public class Subject {

    private String name;
    private SemesterHours semesterHours;
    private double studentHours;
    private double studentValue;

    public void init(String name, SemesterHours semesterHours, int studentHours, double studentValue){
        this.name = name;
        this.semesterHours = semesterHours;
        this.studentHours = studentHours;
        this.studentValue = studentValue;
    }

    public String showSubjectInfo(){
        return String.format("subject : %s, hours in semester : %s , student hours : %d, valuation : %2f",
                name, semesterHours.toString(), studentHours, studentValue);
    }

    // need to check if user pass exam
    public boolean passExamination(Student studentValue){
        if (studentValue.getValue() >= 3) {
            return true;
        }
        return false;
    }

    public double getStudentValue(Student student){
        return 0;
    }
}
