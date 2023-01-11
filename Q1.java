import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height =0;
        double weight = 0;
        double BMI =0;

        System.out.println("Enter your height in meters ");
        height  = sc.nextDouble();
        System.out.println("Enter your weight in kg ");
        weight = sc.nextDouble();

        height = Math.pow(height,2);

        BMI = weight/height;

        System.out.println("Your BMI is "+BMI);

        if (BMI<18.5){
            System.out.println("You are Underweight ");
        }
        else if (BMI >= 18.5 && BMI <= 24.5){
            System.out.println("You are Normal");
        }
        else if (BMI >= 25 && BMI <= 29.9){
            System.out.println("You are Overweight ");
        }
        else {
            System.out.println("You are Obese ");
        }

    }
}
