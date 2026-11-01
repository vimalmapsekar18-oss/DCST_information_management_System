
import java.util.*;

class Subject {

    private String subjectCode;
    private String subjectName;
    private int credits;

    public Subject(String subjectCode,
                   String subjectName, int credits) {

        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.credits = credits;
    }

    public void display() {
        System.out.println(subjectCode + " - "
                + subjectName + " (" + credits + " credits)");
    }
}

class Course {

    private String courseName;
    private int duration;

    private List<Subject> subjects = new ArrayList<>();

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void displayCourse() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Duration: " + duration + " years");

        System.out.println("Subjects:");

        for (Subject s : subjects) {
            s.display();
        }
    }
}
