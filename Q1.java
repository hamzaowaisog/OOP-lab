import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        int op ;
        Scanner sc = new Scanner(System.in);
        car c1 = new car();

        System.out.println("Enter your car Make ");
        c1.setMake(sc.next());
        System.out.println("Enter your car year model ");
        c1.setYearmodel(sc.nextInt());
        System.out.println("Enter your speed ");
        c1.setSpeed(sc.nextInt());

        System.out.println("Car make : " + c1.getMake());
        System.out.println("Car year model : " + c1.getYearmodel());
        System.out.println("Car current speed : "+ c1.getSpeed()+"km/h");

        for(int i = 0 ; i <5 ; i++){
            System.out.println("1: Accelerate \n 2: Deaccelerate ");
            op = sc.nextInt();
            switch (op){
                case 1 :
                    c1.accelerate();
                    System.out.println("Current speed : " +c1.getSpeed()+"km/h");
                    break;
                case 2:
                    c1.deceleerate();
                    System.out.println("Current speed : " +c1.getSpeed()+"km/h");
                    break;


            }
        }


    }
}

class  car{
    private int yearmodel;
    private String make;
    private int speed;

    void setYearmodel(int year){
        yearmodel = year;
    }
    void  setMake(String m){
        make = m;
    }
    void setSpeed(int sp){
        speed = sp;
    }

    String getMake(){
        return make;
    }
    int getYearmodel(){
        return yearmodel;
    }
    int getSpeed(){
        return speed;
    }
    void accelerate(){
        speed = speed +5;
    }
    void deceleerate(){
        speed = speed - 5;
    }
}
