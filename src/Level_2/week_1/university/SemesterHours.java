package Level_2.week_1.university;

/**
 * Created by pc on 09.08.2016.
 */
public class SemesterHours {

    private int semester;
    private int hours;
    private int minHours;

    public SemesterHours(int semester, int hours){
        this.semester = semester;
        this.hours = hours;
        this.minHours = (int) (hours * 0.3);
    }

    public String toString(){
        return String.format("semester number : %d, hours : %d, min hours : %d", semester, hours, minHours);
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

    public void setHours(int hours){
        this.hours = hours;
    }

    public double getMinHours(){
        return minHours;
    }

}
