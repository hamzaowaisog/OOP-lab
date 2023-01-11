import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        double a , b, c ,ans1,ans2;
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the value of a");
         a = sc.nextDouble();
        System.out.println("Enter the value of b");
        b = sc.nextDouble();
        System.out.println("Enter the value of c");
        c = sc.nextDouble();
        double v = Math.pow(b, 2) - (4 * a * c);
        if(v >=0){

            ans1 = -b + (Math.sqrt(v) / (2 * a));

            ans2 = -b - (Math.sqrt(v) / (2 * a));

            System.out.println("The root 1 is " + ans1);
            System.out.println("The root 2 is " + ans2);
        }
        else {
            System.out.println("The roots are complex");

        }
    }
}
