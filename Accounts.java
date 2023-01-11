import java.util.*;
public class Accounts {
    static protected double balance ;


    public Accounts (){

    }
    public void getbalance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance of the account ");
        balance = sc.nextDouble();
    }

    public Accounts(double balance) {
        this.balance = balance;
    }

    public void debit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount  you want to withdraw");
        double withdraw = sc.nextDouble();

        balance = balance-withdraw;

    }

    public void credit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit ");
        double deposit = sc.nextDouble();

        balance = balance+deposit;
    }

    public void display(){
        System.out.println("The current balance of the account is "+balance);
    }
}
