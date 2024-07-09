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
}
