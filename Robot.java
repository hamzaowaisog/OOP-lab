public class Robot {
    double x_cor , y_cor ;
    String direct;

    public Robot(double x_cor, double y_cor, String direct) {
        this.x_cor = x_cor;
        this.y_cor = y_cor;
        this.direct = direct;
    }
    public void in_pos (){
        System.out.println("The x-cordinate of the robot is "+ x_cor);
        System.out.println("The y-cord of the robot is "+y_cor);
        System.out.println("The initial direction  of the robot is "+direct);
    }
}
