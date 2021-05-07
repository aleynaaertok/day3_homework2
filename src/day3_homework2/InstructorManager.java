package day3_homework2;

public class InstructorManager {

    public void instructorData(Instructor instructor) {

        System.out.println("Eğitmenin adı soyadı :" + instructor.getFirstName() + instructor.getLastName());
        System.out.println("Eğitmenin email ve şifresi :" + instructor.getEmail() + instructor.getPassword());
        System.out.println("Eğitmenin id numarası :" + instructor.getId());
        System.out.println("Eğitmenin verdiği dersler :" + instructor.getLessons() + "\n -------------------------------");
    }

}
