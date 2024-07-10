package Services;

import Entities.ClassRoom;
import Entities.Student;

public interface ClassRoomService {
    public void addStudentToClassRoom(ClassRoom classRoom, Student student);
}
