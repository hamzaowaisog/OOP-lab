import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0 ;
        int i=0;
        boolean flag = false;

        System.out.println("Enter the number to check whether it is prime number or not ");

        a = sc.nextInt();

        if (a == 0 || a == 1){
            System.out.println("IT is not a prime number ");
        }
        else if (a == 2){
            System.out.println("IT is a prime number ");
        }
        else{
            for (i=2;i<=a/2;i++){
                if(a%i == 0){
                    flag = true;
                    break;
                }
                else{
                    flag = false;
                }
            }
        }
        if (flag == true){
            System.out.println(a+" is not a prime number ");
        }
        else {
            System.out.println(a+" is a prime number ");
        }
    }
}
