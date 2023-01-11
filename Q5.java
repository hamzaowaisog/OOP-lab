import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , j , k , sum , average , product;
        System.out.println("Enter the num");
        i = sc.nextInt();
        System.out.println("Enter the num");
        j = sc.nextInt();
        System.out.println("Enter the num");
        k = sc.nextInt();

        sum = i+j+k;
        product = i*j*k;
        average = sum /3;

        System.out.println("The sum is "+sum);
        System.out.println("The product is "+product);
        System.out.println("The averagr is "+average);

    }
}
