// Nama : Muthia Zhafira Sahnah 
// NIM : 24060122130071



public class UserInputValidator {
    public static void validateUsername(String username) {
      // TODO: buat assertion yang memenuhi persyaratan username
       assert (username.length() >= 5 && username.length() <= 20) : "Username harus terdiri dari 5 hingga 20 karakter";
       assert username.matches("[a-zA-Z][a-zA-Z0-9_]+") : "Username hanya boleh berisi huruf, angka, dan underscore (_) serta harus diawali dengan huruf";
    }
  
    public static void validateEmail(String email) {
      // TODO: buat assertion yang memenuhi persyaratan email
      assert email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") : "Email tidak valid";
    }
  
    public static void validateAge(int age) {
      // TODO: buat assertion yang memenuhi persyaratan usia
      assert age >= 17 && age <= 99 : "Umur harus lebih dari 17 tahun dan kurang dari 99 tahun";
    }
  }
  