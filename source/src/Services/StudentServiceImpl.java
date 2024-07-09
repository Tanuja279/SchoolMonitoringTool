package Services;

import Entities.ClassRoom;
import Entities.School;
import Entities.Student;

public class StudentServiceImpl implements StudentService {
    @Override
    public void registerStudent(School school, Integer Classroom, Student student) {
        ClassRoom classroom = school.classRoomsList.get(Classroom-1);
        classroom.addStudent(student);
    }
    @Override
    public void studentDetails(Student student){
        System.out.println("Student name : "+student.getName());
        System.out.println("Student roll number : "+student.getRollNum());
        System.out.println("Student address : "+student.getAddress());
        System.out.println("Teacher name is : "+Student.teacher);
    }
}
