public class Car extends MototrVehicle{
    private int no_doors;

    public Car (){

    }

    public Car(int speed, String colour, int no_wheel, String licensplate, int no_doors) {
        super(speed, colour, no_wheel, licensplate);
        this.no_doors = no_doors;
    }

    public int getNo_doors() {
        return no_doors;
    }

    public void setNo_doors(int no_doors) {
        this.no_doors = no_doors;
    }

    public void display(){
        System.out.println("The Speed of the vehicle is : " + getSpeed());
        System.out.println("The Colour of vehicle is : " + getColour());
        System.out.println("The number of wheels are : " + getNo_wheel());
        System.out.println("The number of license plate is : "+getLicensplate());
        System.out.println("The number of doors are : "+ no_doors);
    }
}
