import java.util.*;

public class employee {

    String name , position ;
    int no_years ;
    double salary =30000;

    public employee(){
        System.out.println("I am an Employee");
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        name = sc.next();
        System.out.println("Enter your position ");
        position = sc.next();
        System.out.println("Enter the number of years you worked ");
        no_years = sc.nextInt();
        System.out.println("Enter your Salary ");
        salary = sc.nextDouble();
    }

    public employee(String name, String position, int no_years, double salary) {
        System.out.println("I am an employee");
        this.name = name;
        this.position = position;
        this.no_years = no_years;
        this.salary = salary;
    }

    public  void display() {
        System.out.println("Name  : "+name);
        System.out.println("Position : "+position);
        System.out.println("Number of years : "+no_years);
        System.out.println("Salary  : "+salary);

    }

}
