import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int acc_no=0;
        int cus_co=0;
        int no_chan=0;
        int no_base=0;
        int rem =0;
        float r_bpf = 4.50f;
        float r_bsf = 20.50f;
        float r_pc = 7.50f;
        float b_bpf = 15.00f;
        float b_bsf1 = 75.00f;
        float b_bsf2 = 5.00f;
        float b_pc = 50.00f;
        float total = 0;



        char choice ;
        System.out.println("Enter the type of customer you are ");
        System.out.println("Enter R for residential or B for Business ");

        choice = sc.next().charAt(0);

        if (choice =='r' || choice == 'R' ){
            System.out.println("Enter your Account number ");
            acc_no = sc.nextInt();
            System.out.println("Enter your customer code ");
            cus_co = sc.nextInt();
            System.out.println("Enter the number of premium channel ");
            no_chan = sc.nextInt();

            total = r_bpf + r_bsf + (r_pc*no_chan);

            System.out.println("Your bill is ");
            System.out.println("Acc no "+acc_no+" customer code " + cus_co+" and the total amount is $"+total);

        }
        else if (choice == 'b' || choice == 'B'){
            System.out.println("Enter your Account number ");
            acc_no = sc.nextInt();
            System.out.println("Enter your customer code ");
            cus_co = sc.nextInt();
            System.out.println("Enter the number of premium channel ");
            no_chan = sc.nextInt();
            System.out.println("Enter the number of connections ");
            no_base = sc.nextInt();
            if (no_base >10){
                rem = no_base - 10;
                total = b_bpf + b_bsf1 + (rem * b_bsf2) + (no_chan*b_pc);
            }
            else{
                total = b_bpf + b_bsf1 + (no_chan*b_pc);
            }
            System.out.println("Your bill is ");
            System.out.println("Acc no "+acc_no+" customer code " + cus_co+" and the total amount is $"+total);

        }
        else{
            System.out.println("Enter correct option ");
        }


    }
}
