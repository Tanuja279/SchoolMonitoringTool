package Services;

import Entities.ClassRoom;
import Entities.School;
import Entities.Student;

public class SchoolServiceImpl implements SchoolService{
    StudentService studentService = new StudentServiceImpl();
    @Override
    public void displayStudentList(School school){
        for(ClassRoom classRoom : school.getClassRoomsList()){
            for(Student student : classRoom.getStudentList()){
                studentService.studentDetails(student);
            }
        }
    }

}
