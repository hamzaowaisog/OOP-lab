import java.util.*;

public class student_detail {

    public static void main(String[] args) {

        Student sd1  = new Student("Hamza","Bs-SE",3.88f,213815);
        sd1.print();

        System.out.println();
        System.out.println();


        Student sd2 = new Student(sd1);
        sd2.print();


    }
}

class Student {
    Scanner sc = new Scanner(System.in);


    int studentID;
    String name;
    float cgpa;
    String department;

    void setName(String name1){
        this.name = name1;
    }
    String getName(){
        return name;
    }
    void setStudentID(int studentID1){
        this.studentID = studentID1;
    }
    int getStudentID(){
        return studentID;
    }
    void setCgpa(float cgpa1){
        this.cgpa = cgpa1;
    }
    float getCgpa(){
        return cgpa;
    }
    void setDepartment(String department1){
        this.department = department1;
    }
    String getDepartment(){
        return department;
    }

    void print(){
        System.out.println("StudentID :- "+studentID);
        System.out.println("Name :- " + name);
        System.out.println("Department :- " + department);
        System.out.println("cgpa :- "+ cgpa);
    }

    Student(String name1 , String department1 , float cgpa1 , int studentID1){
        this.studentID = studentID1;
        this.name = name1;
        this.department = department1;
        this.cgpa = cgpa1;
    }

    Student( Student sd){
        this.cgpa = sd.cgpa;
        this.name = sd.name;
        this.department = sd.department;
        this.studentID = sd.studentID;
    }



}
