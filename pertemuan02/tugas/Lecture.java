import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private String employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void getDetails() {
        System.out.println("----MENAMPILKAN DATA LECTURE" +" "+ employeeID + "----");
        System.out.println("Nama Dosen: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Alamat: " + address);
        System.out.println("ID Dosen: " + employeeID);
    }

    public void teachCourse(Course c) {
        coursesTaught.add(c);
    }

    public void viewTaughtCourses() {
        System.out.println(name + " " + "Mengajar mata kuliah:");
        for (Course c : coursesTaught) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
