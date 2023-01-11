import javax.security.auth.login.AccountException;

public class Course {
    protected String course_name;
    protected String course_code;
    protected String class_venue;
    protected int cr_hours;

    public Course(){

    }
    public Course(String course_name , String course_code , String class_venue , int cr_hours){
        this.course_name = course_name;
        this.course_code = course_code;
        this.class_venue = class_venue;
        this.cr_hours = cr_hours;

    }
}
