package child;

import parent.Person;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        super(name, address, age);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getStudentId(){
        return studentID;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    @Override
    public void getDetails() {
       super.getDetails();
       System.out.println("ID Siswa: " + studentID);
    }

    public void enrollCourse(Course c) {
        coursesEnrolled.add(c);
    }

    public void viewEnrolledCourses() {
        for (Course c : coursesEnrolled) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
