package Entities;

import Entities.ClassRoom;
import java.util.*;
import java.util.ArrayList;

public class School {
    private List<ClassRoom> classRoomsList = new ArrayList<>();

    public List<ClassRoom> getClassRoomsList(){
        return this.classRoomsList;
    }

    public void setClassRoomsList(List<ClassRoom> classRoomsList){
        this.classRoomsList = classRoomsList;
    }

    public School(){
        for(int i=1; i<=10; i++) {
            this.classRoomsList.add(new ClassRoom(String.valueOf(i)));
        }
    }




}
