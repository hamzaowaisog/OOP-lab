import java.util.*;

public class Adder {
    static int add1 , add2;
    static public void addint(){
        Scanner sc = new Scanner (System.in);
        int a1 ,a2;

        System.out.println("Enter the int 1");
        a1 = sc.nextInt();

        System.out.println("Enter the int 2");
        a2 = sc.nextInt();

        add1 = a1 + a2;
    }

    static public void addarray(){
        Scanner sc = new Scanner(System.in);
        int num ;

        System.out.println("Enter the number of element you want in the array ");
        num = sc.nextInt();

        int[] arr1 = new int[num];

        for(int i =0 ; i<num ; i++){
            System.out.println("Enter the Num "+(i+1));
            arr1[i] = sc.nextInt();
            add2 = add2 + arr1[i];
        }

    }

    public void display(){
        System.out.println("The sum of two integer is "+add1);
        System.out.println("The sum of the integer array is "+add2);
    }

}
