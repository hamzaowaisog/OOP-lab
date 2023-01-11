public class MovingRobot extends Robot{
    public MovingRobot(double x_cor, double y_cor, String direct) {
        super(x_cor, y_cor, direct);
        in_pos();
    }
    public void moveRobot(double x ,double y){

        x_cor = x_cor+x;
        y_cor = y_cor+y;

    }

    public void display(){
        System.out.println("The new x -cordinate : "+x_cor);
        System.out.println("The new y-cordinate :"+y_cor);
        if (y_cor >0 && x_cor >0 ) {
            System.out.println("The new y direction is North "  );
            System.out.println("The new X direction is  East");
        }
        else if(y_cor >0 && x_cor<0){
            System.out.println("The new y direction is North " );
            System.out.println("The new X direction is  West");
        }
        else if (y_cor <0 && x_cor>0){
            System.out.println("The new y direction is south" );
            System.out.println("The new X direction is  East");
        }
        else if(y_cor < 0 && x_cor <0){
            System.out.println("The new y direction is South");
            System.out.println("The new X direction is  West");
        }
    }


}
