package Level_2.week_1.university;

/**
 * Created by oleksandr.maslovskyj on 12.08.2016.
 */
public class Test {

    public static void main(String[] args) {

        Address address = new Address("Kyiv", "some street", 10, 123);
        SemesterHours semesterHours = new SemesterHours(1, 120);

        Subject subject0 = new Subject("math", semesterHours);
        Subject subject1 = new Subject("literature", semesterHours);
        Subject subject2 = new Subject("philof", semesterHours);

        Student student = new Student("student1", address);

        student.addSubject(subject0);
        student.addSubject(subject1);
        student.addSubject(subject2);

        student.learning(subject1);
        System.out.println(student.showAllInfoAboutSubjects());

        student.removeLastSubject();
        System.out.println(student.showAllInfoAboutSubjects());

    }
}
