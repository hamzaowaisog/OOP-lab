import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade ;
        int assi =0;
        int g_marks=0;

        System.out.println("Enter your grade ");
        grade = sc.next();

        System.out.println("Enter the number of assignment you have failed ");
        assi = sc.nextInt();

        switch (grade){
            case "a":
            case "A":
                if (assi > 3){
                    g_marks = 0;
                    System.out.println("The grace marks you obtained is "+g_marks);
                }
                else{
                    g_marks = 5;
                    System.out.println("The grace marks you obtained is "+g_marks);
                }
                break;
            case "b":
            case "B":
                if(assi > 2){
                    g_marks =0;
                    System.out.println("The grace marks you obtained is "+g_marks);

                }
                else{
                    g_marks = 4;
                    System.out.println("The grace marks you obtained is "+g_marks);
                }
                break;
            case "c":
            case "C":
                if(assi > 1){
                    g_marks=0;
                    System.out.println("The grace marks you obtained is "+g_marks);
                }
                else {
                    g_marks=5;
                    System.out.println("The grace marks you obtained is "+g_marks);
                }
                break;

            default:
                System.out.println("Enter the correct option ");

        }


    }
}
