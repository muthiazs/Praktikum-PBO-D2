import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String address;
    private String studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void getDetails() {
        System.out.println("----MENAMPILKAN DATA SISWA" +" "+studentID + "----");
        System.out.println("Nama mahasiswa: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Alamat: " + address);
        System.out.println("ID Siswa: " + studentID);
    }

    public void enrollCourse(Course c) {
        coursesEnrolled.add(c);
    }

    public void viewEnrolledCourses() {
        System.out.println("Course yang diambil " + name);
        for (Course c : coursesEnrolled) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
