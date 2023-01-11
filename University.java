public class University {
    public static void main(String[] args) {

        Student.setUni_name("FAST University");
        Student sd1 = new Student("Hamza");
        Student sd2 = new Student("Huzaifa");
        Student sd3 = new Student("Zayn");

        System.out.println();
        sd1.print();
        System.out.println();
        sd2.print();
        System.out.println();
        sd3.print();

    }
}
class Student {
    private String name;
    private int roll_no =0;
    private static String uni_name;
    static int counter =0;

    Student(String name ){
        this.name = name;
        this.roll_no = setRoll_no();
    }

   /* public String getName() {
        return name;
    }*/

    /*public void setName(String name) {
        this.name = name;
    }*/

    public static int setRoll_no() {
        counter ++ ;
        return counter;

    }

    public static void setUni_name(String uni_name) {
        Student.uni_name = uni_name;
    }

    public static String getUni_name(){
        return uni_name;
    }

    /*public int getRoll_no() {
        return roll_no;
    }*/

    /*public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }*/

    public void print(){
        System.out.println("Student's Information ");
        System.out.println("Name: " + name);
        System.out.println("Roll no: "+ roll_no);
        System.out.println("University Name: " + getUni_name());
    }

}