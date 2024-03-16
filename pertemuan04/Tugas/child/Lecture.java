package child;

import parent.Person;

import java.util.ArrayList;
import java.util.List;

public class Lecture extends Person {
    private String employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID) {
        super(name, address, age);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("ID Dosen: " + employeeID);
    }

    public void teachCourse(Course c) {
        coursesTaught.add(c);
    }

    public void viewTaughtCourses() {
        System.out.println(getName() + " mengajar mata kuliah:");
        for (Course c : coursesTaught) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
