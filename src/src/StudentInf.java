import java.util.Scanner;

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
        schl.addStudent(name, address, standard);

        schl.displayStudentsList();

//        Student stu = new Student("Jaanu", 27, "Hassan" );
//        //stu.display();
//        String names[] = {"11","22","33","44","55","66"};
//        //ArrayList<Students> students = new ArrayList<>();
        //ClassRoom cr = new ClassRoom();
//        int count = 1;
//        for(String obj : names){
//            //students.add(new Students(obj, count, "Hassan"));
//            //System.out.println(obj);
//            cr.addStudent(new Student(obj, count, "Hassan"));
//            count++;
//        }
//        for(Students st : students){
//            st.display();
//        }
        //cr.showStudentsList();


    }
}
