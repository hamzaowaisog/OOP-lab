
import java.util.*;

public class Purchase {
    public static void main(String[] args) {
        double average;
        average_purchase avg1 = new average_purchase();
        avg1.entry();
        System.out.println();
        avg1.display();
        System.out.println();
        average = avg1.average();

        System.out.println("The average cost of the item is  "+ average);


    }
}
class average_purchase{
    private double cost [];
    private String name[];

    Scanner sc = new Scanner(System.in);

    public double[] getCost() {
        return cost;
    }

    public void setCost(double[] cost) {
        this.cost = cost;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void entry(){
        int num =0;
        System.out.println("Enter the number of items");
        num = sc.nextInt();
        cost = new double[num];
        name = new String[num];

        double cost_1 [] = new double[num];
        String name_1 [] = new String[num];
        for (int i = 0 ; i<num ; i++){
            System.out.println("Enter the name of the item "+(i+1));
            name_1[i]=sc.next();
            System.out.println("Enter the cost of the item "+(i+1));
            cost_1[i]=sc.nextDouble();
        }
        setCost(cost_1);
        setName(name_1);
    }

    public void display(){
        String name_2[]=new String[name.length];
        double cost_2[] = new double[name.length];

        name_2 = getName();
        cost_2 = getCost();
        for(int i=0;i< name.length;i++){
            System.out.println("Item name :"+name_2[i]);
            System.out.println("Item cost :"+cost_2[i]);
        }
    }
    public double average (){
        double average = 0;
        double total = 0;
        double cost_2[] = new double[name.length];
        cost_2 = getCost();


        for (int i =0 ; i< cost.length;i++){
            total = total +cost_2[i];
        }

        average = total / cost_2.length;

        return average;
    }
}
