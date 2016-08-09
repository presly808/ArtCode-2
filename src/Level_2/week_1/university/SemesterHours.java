package Level_2.week_1.university;

/**
 * Created by pc on 09.08.2016.
 */
public class SemesterHours {

    private int semester;
    private double hours;

    public void init(int semester, double hours){
        this.semester = semester;
        this.hours = hours;
    }

    public String toString(){
        return String.format("semester number : %d, hours : %2f", semester, hours);
    }

    public int getSemester(){
        return semester;
    }

    public double getHours(){
        return hours;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }

    public void setHours(double hours){
        this.hours = hours;
    }

}
