package Entities;

public class Student {
        private String name;
        private int rollNum;
        private String address;
        static String teacher;
        public void test(){
            return ;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public int getRollNum(){
            return rollNum;
        }
        public void setRollNum(int rollNum){
            this.rollNum =rollNum;
        }

        public String getAddress(){
            return address;
        }
        public void setAddress(String address){
            this.address = address;
        }

        public Student(){

        }
        public Student(String name1, int rollNum1, String address1){
            this.name = name1;
            this.rollNum = rollNum1;
            this.address = address1;
        }
        static
        {
            teacher = "Ravi L S";
        }

        public void display(){
            System.out.println("Name : "+this.name);
            System.out.println("RollNumber : "+this.rollNum);
            System.out.println("Address : "+this.address);
            System.out.println("Teacher name : "+teacher);
        }

        public String test(){
            return "nothing" ;
        }
}
