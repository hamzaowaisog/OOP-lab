import java.util.*;
public class SavingAccount extends Accounts{
    double timespan ;
    double interest_rate ;
    double interest;
    public SavingAccount(){

            }
    public double calculateinterest (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time span for the money you saved ");
        timespan = sc.nextDouble();

        System.out.println("Enter the interest rate you get ");
        interest_rate = sc.nextDouble();

        interest = balance * interest_rate * timespan;

        System.out.println("The interest you got "+ interest);

        return interest;
    }

    @Override
    public void credit(){
        interest = calculateinterest();
        balance = balance + interest;
    }

}
