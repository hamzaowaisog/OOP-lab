import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial x-cordinate ");
        double x = sc.nextDouble();
        System.out.println("Enter the initial y-cordinate ");
        double y = sc.nextDouble();
        System.out.println("Enter the initial direction ");
        String di = sc.next();

        MovingRobot m1 = new MovingRobot(x,y,di);

        System.out.println("Enter the step in which it will move ");
        double step = sc.nextDouble();

        for(int i =0 ; i<step ; i++){
            System.out.println("Enter the x-cordinate you want to move");
            double x1 = sc.nextDouble();
            System.out.println("Enter the y-cordinate you want to move");
            double y1 = sc.nextDouble();
            m1.moveRobot(x1,y1);
            m1.display();
        }





    }
}
