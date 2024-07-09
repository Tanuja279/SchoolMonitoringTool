package Entities;
import java.util.ArrayList;

public class School {
    public ArrayList<ClassRoom> classRoomsList = new ArrayList<>();

    public void addStudent(String name, String address, int standard){
        Student stdnt = new Student();
        stdnt.setName("Tanu");
        stdnt.setAddress("Bangalore");
        //this.classRoomsList.get(standard).addStudent(stdnt);

        ClassRoom classroom = this.classRoomsList.get(standard-1);
        classroom.addStudent(stdnt);
    }
    public School(){
        for(int i=1; i<=10; i++) {
            this.classRoomsList.add(new ClassRoom(String.valueOf(i)));
        }
    }

    public void displayStudentsList(){
        for(ClassRoom cr : this.classRoomsList){
            System.out.println("Printing student list for classroom : "+cr.classRoom);
//            for(Student st : cr.studentsList){
//                st.display();
//            }
            cr.showStudentsList();

        }

    }


}
