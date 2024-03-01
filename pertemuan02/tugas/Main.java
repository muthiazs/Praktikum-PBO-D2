// Nama : Muthia Zhafira Sahnah 
// NIM : 24060122130071
//LAB D2 

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lecture
        Lecture Budi = new Lecture("Budi", 45, "Jl Karangrejo", "L001");
        Lecture Adi = new Lecture("Adi", 35, "Jl Trunojoyo", "L002");
        Lecture Kusno = new Lecture("Kusno", 55, "Jl Wahid Hasyim", "L003");

        // Membuat objek Student
        Student Cahyo = new Student("cahyo", 20, "Jl damar no 10", "S001");
        Student Edi = new Student("Edi", 22, "Jl waru no 2", "S002");
        Student Ani = new Student("Ani", 20, "Meteseh Raya no 4", "S003");
        Student Cinta = new Student("Cinta", 20, "Meteseh Raya no 5", "S004");

        // Membuat objek Course
        Course PBO = new Course("C001", "PBO", Budi);
        Course ASA = new Course("C002", "ASA", Adi);
        Course GKV = new Course("C003", "GKV", Kusno);

        //Menampilkan detail biodata siswa 
        Cahyo.getDetails();
        Edi.getDetails();
        Ani.getDetails();
        //enroll course 
        Cahyo.enrollCourse(GKV);
        Cahyo.enrollCourse(PBO);
        Edi.enrollCourse(ASA);
        Edi.enrollCourse(PBO);
        Ani.enrollCourse(GKV);
        Ani.enrollCourse(ASA);
        //Mengecek course apa saja yang diambil Ani 
        Ani.viewEnrolledCourses();
        //Menampilkan detail dosen 
        Budi.getDetails();
        Adi.getDetails();
        Kusno.getDetails();
        //teachcourse
        Adi.teachCourse(ASA);
        //view Taught Course
        Adi.viewTaughtCourses();
        //addstudent 
        GKV.addStudent(Cinta);
        GKV.addStudent(Cahyo);
        PBO.addStudent(Cahyo);
        ASA.addStudent(Edi);
        PBO.addStudent(Edi);
        GKV.addStudent(Ani);
        ASA.addStudent(Ani);
        //removestudent
        GKV.removeStudent(Cahyo);
        //viewenrolledstudent
        GKV.viewEnrolledStudents();
        ASA.viewEnrolledStudents();
        PBO.viewEnrolledStudents();

        
        
        
    }
}


  