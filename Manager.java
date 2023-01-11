import java.util.*;

public class Manager extends Employee{

    String name [] = new String[5];

    public Manager(){

        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("I am a Manager ");

        for(int i =0 ; i<5 ; i++){
            System.out.println("Enter the employee "+(i+1)+" name");
            name[i] = sc.next();
        }

        for(int i = 0 ; i<5 ; i++){
            System.out.println("The name of employees are " +name[i]);
        }

        input();
        input1();
        display1();
        display();


    }
}
