import java.util.Scanner;
import Entities.ClassRoom;
import Entities.*;
import Services.SchoolService;
import Services.SchoolServiceImpl;
import Services.StudentService;
import Services.StudentServiceImpl;

public class StudentInf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Please enter the address of the student");
        String address = sc.nextLine();
        System.out.println("Please enter in which standard student want's to join");
        int standard = sc.nextInt();

        School schl = new School();
        Student stu = new Student(name, 1, address );


        StudentService studentService= new StudentServiceImpl();
        studentService.studentDetails(stu);

        studentService.registerStudent(schl, standard, stu);

        SchoolService schoolService = new SchoolServiceImpl();
        schoolService.displayStudentList(schl);




    }
}
