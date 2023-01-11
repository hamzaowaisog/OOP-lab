import java.util.*;
public class Employee extends Person{
    Scanner sc = new Scanner(System.in);
    protected String co_name , co_location ;
    protected int no_years;
    public Employee(){
        super();
        System.out.println("I am an Employee");
    }
    public void input1(){
        System.out.println("Enter the company name ");
        co_name = sc.next();
        System.out.println("Enter the company location ");
        co_location = sc.next();
        System.out.println("Enter the number of year for working ");
        no_years = sc.nextInt();
    }

    public void display1(){
        System.out.println("The name of the company is :" + co_name);
        System.out.println("The location of the company is: "+ co_location);
        System.out.println("The number of year working in the company is: " + no_years);
    }

}
