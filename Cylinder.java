import java.math.*;
public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){

    }
    public Cylinder (double radius){
        super (radius);
        setRadius(radius);
    }
    public Cylinder(double radius , double height){
        super(radius);
        this.height = height;
        setRadius(radius);
    }
    public Cylinder(double radius , double height , String color ){
        super(radius , color);
        this.height = height;
        setRadius(radius);
        setColor(color);
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getvolume(){
        return (Math.PI * Math.pow(getRadius(),2)*height);
    }
}
