public class Area {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();

        r1.setLength(4.0);
        r1.setBreadth(5.0);
        //r1.setArea(4.0,5.0);

        System.out.println("The area of rectangle 1 is :"+r1.getArea());

        r2.setLength(5.0);
        r2.setBreadth(8.0);

        System.out.println("The area of rectangle 2 is :"+r2.getArea());

    }
}
class rectangle {
    private double length,area,breadth;

    void setLength(double length1){
        length = length1;
    }
    void setBreadth(double breadth1){
        breadth = breadth1;
    }
    /*void setArea (double length , double breadth ){
        area = length * breadth;
    }*/
    double getArea(){
        return (area=length*breadth);
    }
}

