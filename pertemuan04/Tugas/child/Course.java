package child;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public void addStudent(Student s) {
        studentsEnrolled.add(s);
    }

    public void removeStudent(Student s) {
        studentsEnrolled.remove(s);
    }

    public void viewEnrolledStudents() {
        System.out.println("Siswa di mata kuliah " + courseName + ":");
        for (Student s : studentsEnrolled) {
            System.out.println("- " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
