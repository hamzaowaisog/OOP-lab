import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c=0;

        System.out.println("Enter the first value ");
        a = sc.nextInt();
        System.out.println("Enter the second value ");
        b = sc.nextInt();

        System.out.println("The original values are "+a+" "+b);

        c=a;
        a=b;
        b=c;
        System.out.println("The interchanged values are "+a+" "+b);


    }
}
