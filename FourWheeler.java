import java.util.*;
public class FourWheeler extends vehicle {
    boolean p_steering ;
    public FourWheeler() {

    }
    public FourWheeler(String v_name , String V_no , int wheels , boolean p_steering){
        this.v_name = v_name;
        this.v_no = V_no;
        this.v_wheels = wheels;
        this.p_steering = p_steering;
    }

    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed of the car ");
        double speed = sc.nextDouble();
        System.out.println("The name of the vehicle is "+v_name);
        System.out.println("The number of the vehicle is "+v_no);
        System.out.println("The vehicles has the wheel "+v_wheels);
        accelerate(speed);
        if (p_steering == true){
            System.out.println("The vehicle has the power steering ");
        }
        else{
            System.out.println("The vehicle does not have the power steering ");
        }

    }

}
