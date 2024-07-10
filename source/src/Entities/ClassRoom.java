package Entities;

import java.util.*;

public class ClassRoom {

    private String standard;
    private List<Student> studentsList = new ArrayList<>();
    public ClassRoom(){

    }

    public ClassRoom(String standard){
        this.standard = standard;
    }

    public String getStandard(){
        return this.standard;
    }
    public void setStandard(String standard){
        this.standard = standard;
    }
    public List<Student> getStudentList(){
        return this.studentsList;
    }
}
