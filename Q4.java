public class Q4 {
    public static void main(String[] args) {

        System.out.println("The account class demonstration ");
        Accounts a1 =  new Accounts();
        a1.getbalance();

        a1.debit();
        a1.display();

        a1.credit();
        a1.display();

        System.out.println();
        System.out.println("The saving account demonstration");
        SavingAccount s1 = new SavingAccount();
        s1.credit();
        s1.display();

        System.out.println();
        System.out.println("The checking account demonstration ");

        CheckingAccount c1 = new CheckingAccount();

        c1.display();

    }
}
