import java.util.*;
public class Q2b {
    public static void main(String[] args) {
        float height, base, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the triangle");
        height = sc.nextFloat();
        System.out.println("Enter the base of the triangle");
        base = sc.nextFloat();

        area = 0.5f * height * base;

        System.out.println("The area of triangle is " + area);

    }
}
