package Services;

import Entities.ClassRoom;
import Entities.Student;

public class ClassRoomServiceImpl implements ClassRoomService{
    @Override
    public void addStudentToClassRoom(ClassRoom classRoom, Student student){
        classRoom.getStudentList().add(student);
    }
}
