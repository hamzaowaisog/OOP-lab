public class PartTimeEmployee extends employee {
    double increment = 0.05;

    public PartTimeEmployee(){
        super();
        System.out.println("I am a part time employee in the company");
        salary = salary *(increment+1);

    }

    public PartTimeEmployee(String name, String position, int no_years, double salary, double increment) {
        super(name, position, no_years, salary);
        this.increment = increment;
    }
    @Override
    public void display(){
        System.out.println("Name  : "+name);
        System.out.println("Position : "+position);
        System.out.println("Number of years : "+no_years);
        System.out.println("Increment in the salary : 5%");
        System.out.println("Salary  : "+(salary*(increment+1)) );

    }

}
