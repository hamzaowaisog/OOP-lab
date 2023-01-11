import java.util.*;


public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        System.out.println("Enter employee 1 first name ");
        emp1.setFirstname(sc.next());
        System.out.println("Enter employee 1 last name ");
        emp1.setLastname(sc.next());
        System.out.println("Enter employee 1 monthly salary ");
        emp1.setM_salary(sc.nextDouble());
        System.out.println("Enter employee 2 first name ");
        emp2.setFirstname(sc.next());
        System.out.println("Enter employee 2 last name ");
        emp2.setLastname(sc.next());
        System.out.println("Enter employee 2 monthly salary ");
        emp2.setM_salary(sc.nextDouble());
        System.out.println();

        System.out.println("Employee 1");
        System.out.println("First Name :" + emp1.getFirstname());
        System.out.println("Last Name :" + emp1.getLastname());
        System.out.println("Monthly Salary :" + emp1.getM_salary());
        System.out.println("Yearly Salary :"+ emp1.getY_salary());
        System.out.println("Yearly Salary after 10% increment :" + emp1.getinc_y_salary());
        System.out.println();

        System.out.println("Employee 2");
        System.out.println("First Name :" + emp2.getFirstname());
        System.out.println("Last Name :" + emp2.getLastname());
        System.out.println("Monthly Salary :" + emp2.getM_salary());
        System.out.println("Yearly Salary :"+ emp2.getY_salary());
        System.out.println("Yearly Salary after 10% increment :" + emp2.getinc_y_salary());

    }
}
class Employee{
    private String firstname,lastname;
    private double m_salary;
    private double y_salary;
    void setFirstname(String fname){
        firstname = fname;
    }
    void setLastname(String lname){
        lastname = lname;
    }
    void setM_salary(double salary) {
        if (salary < 0) {
            m_salary = 0.0;
        }
        else{
            m_salary = salary;
        }
    }
    /*void set_ysalary(){
        y_salary = m_salary*12;
    }*/
    String getFirstname(){
        return firstname;
    }
    String getLastname(){
        return lastname;
    }
    double getM_salary(){
        return m_salary;
    }
    double getY_salary(){
        y_salary = m_salary*12;
        return y_salary;
    }
    double getinc_y_salary(){
        return (y_salary*1.1);
    }

}
