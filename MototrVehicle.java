public class MototrVehicle extends vehicle{
    private String licensplate;

    public MototrVehicle(){

    }

    public MototrVehicle(int speed, String colour, int no_wheel, String licensplate) {
        super(speed, colour, no_wheel);
        this.licensplate = licensplate;
    }

    public String getLicensplate() {
        return licensplate;
    }

    public void setLicensplate(String licensplate) {
        this.licensplate = licensplate;
    }
}
