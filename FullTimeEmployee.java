public class FullTimeEmployee extends employee {
    double increment = 0.20;

    public FullTimeEmployee(){
        super();
        System.out.println("I am a full time employee in the company");
        salary = salary * (increment+1);
    }

    public FullTimeEmployee(String name, String position, int no_years, double salary, double increment) {
        super(name, position, no_years, salary);
        this.increment = increment;
        salary = salary *(increment+1);
    }
    @Override
    public void display(){
        System.out.println("Name  : "+name);
        System.out.println("Position : "+position);
        System.out.println("Number of years : "+no_years);
        System.out.println("Increment in the salary : 20% ");
        System.out.println("Salary  : "+(salary*(increment+1)) );
    }
}
