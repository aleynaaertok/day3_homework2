package day3_homework2;

public class StudentManager {

    public void studentData(Student student) {

        System.out.println("Öğrencinin adı soyadı :" + student.getFirstName() + student.getLastName());
        System.out.println("Öğrencinin email ve şifresi :" + student.getEmail() + student.getPassword());
        System.out.println("Öğrencinin id numarası :" + student.getId());
        System.out.println("Öğrencinin bildiği yazılım dilleri :" + student.getSoftwareLanguages() + "\n -------------------------------");
    }
}
