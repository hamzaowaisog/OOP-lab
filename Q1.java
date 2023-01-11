public class Q1 {
    public static void main(String[] args) {
        employee emp1 = new employee();
        System.out.println("Employee class");
        emp1.input();
        emp1.display();
        System.out.println();
        FullTimeEmployee fmp1 = new FullTimeEmployee();
        System.out.println("Full time employee");
        fmp1.input();
        fmp1.display();
        System.out.println();
        PartTimeEmployee pme1 = new PartTimeEmployee();
        System.out.println("Part time employee");
        pme1.input();
        pme1.display();
    }
}
