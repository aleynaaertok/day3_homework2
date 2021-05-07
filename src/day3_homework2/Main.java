package day3_homework2;

public class Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor();

        instructor.setFirstName("Engin");
        instructor.setLastName("DEMİROĞ");
        instructor.setEmail("engındemırog@gmail.com");
        instructor.setPassword("123456");
        instructor.setId("1");
        instructor.setLessons("Java+React,C#,Phyton");


        Student student = new Student();

        student.setFirstName("Aleyna");
        student.setLastName("ERTOK");
        student.setEmail("aleynaertok@gmail.com");
        student.setPassword("456789");
        student.setId("2");
        student.setSoftwareLanguages("Java,C");

        Student student1 = new Student();

        student1.setFirstName("Yağız");
        student1.setLastName("KÖKSAL");
        student1.setEmail("yagızkoksal@gmail.com");
        student1.setPassword("13579");
        student1.setId("3");
        student1.setSoftwareLanguages("C,C++,Java");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.instructorData(instructor);

        StudentManager studentManager = new StudentManager();
        studentManager.studentData(student);
        studentManager.studentData(student1);


    }

}

