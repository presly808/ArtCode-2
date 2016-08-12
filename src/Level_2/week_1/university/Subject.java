package Level_2.week_1.university;

/**
 * Created by pc on 09.08.2016.
 */
public class Subject {

    private String name;
    private SemesterHours semesterHours;
    private int studentHours;
    private int studentValue;


    public Subject(String name, SemesterHours semesterHours){
        this.name = name;
        this.semesterHours = semesterHours;
        this.studentHours = generateStudentHours();
        this.studentValue = generateStudentValue();
    }

    public String toString(){
        return String.format("subject : %s, %s , student hours : %d, rating : %d",
                name, semesterHours.toString(), studentHours, studentValue);
    }

    // need to check if user pass exam
    public boolean passExamination(Student student){
        if (generateStudentValue() > 2 && generateStudentValue() <= 5) {
            if (generateStudentHours() >= semesterHours.getMinHours()) {
                return true;            }
        }
        return false;
    }

    public double getStudentValue(Subject subject){
        return subject.getStudentValue();
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

    public int getStudentValue() {
        return studentValue;
    }

    public int generateStudentValue(){
        return (int)(Math.random() * 4) + 1;
    }

    public int generateStudentHours(){
        return (int)(Math.random() * semesterHours.getHours());
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

    public void setStudentValue(int studentValue) {
        this.studentValue = studentValue;
    }
}
