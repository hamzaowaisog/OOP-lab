import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int i , j ;
         String op ;
         int ans;

        System.out.println("Enter the first number");
        i = sc.nextInt();
        System.out.println("Enter the second number");
        j = sc.nextInt();
        System.out.println("Enter the operation you want to perform ");
        op = sc.next();

        if(op.equals("+")) {
            ans = i+j;
            System.out.println("The result is "+ans);
        }
        else if (op.equals("-")){
            ans = i-j;
            System.out.println("The result is "+ans);
        }
        else if (op.equals("*")){
            ans = i*j;
            System.out.println("The result is "+ans);
        }
        else if (op.equals("/")){
            ans = i/j;
            System.out.println("The result is "+ans);
        }
        else{
            System.out.println("Enter the correct operator");
        }

    }
}
