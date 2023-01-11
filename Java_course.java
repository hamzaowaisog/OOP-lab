public class Java_course extends Course{

    String Teacher_name;
    public Java_course (String teacher_name , String course_name , String course_venue , String course_code , int cr_hrs){
        super(course_name , course_code , course_venue , cr_hrs);
        this.Teacher_name = teacher_name;

    }

    public void display(){
        System.out.println("Course title "+course_name);
        System.out.println("Course code " +course_code);
        System.out.println("Course venue "+class_venue);
        System.out.println("Teacher name "+Teacher_name);
        System.out.println("Credit hours "+cr_hours);
    }
}
