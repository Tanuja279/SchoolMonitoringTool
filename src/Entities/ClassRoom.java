import java.util.ArrayList;

public class ClassRoom {
    //public Students student = new Students();
    String classRoom;
    public ClassRoom(){

    }
    public ClassRoom(String classRoom){
        this.classRoom = classRoom;
    }
    public ArrayList<Student> studentsList = new ArrayList<>();

    public void addStudent(Student student){
        this.studentsList.add(student);
    }

    public void showStudentsList(){
        for(Student stn : this.studentsList ){
            stn.display();
        }
    }
}
