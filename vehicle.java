public class vehicle {
    private int speed;
    private String colour;
    private int no_wheel;

    public vehicle(){

    }

    public vehicle(int speed, String colour, int no_wheel) {
        this.speed = speed;
        this.colour = colour;
        this.no_wheel = no_wheel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNo_wheel() {
        return no_wheel;
    }

    public void setNo_wheel(int no_wheel) {
        this.no_wheel = no_wheel;
    }
}
