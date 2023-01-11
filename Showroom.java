public class Showroom {
    public static void main(String[] args) {
        cars c1 = new cars("Ferarri" , "Red" , 2018 , 2500);
        c1.print();
        cars c2 = new cars("Civic" , "Pearl White" , 2020 ,1800);
        cars c3 = new cars("Corolla " , "Black" , 2019 , 1600);

        //c1.print();
        c2.print();
        c3.print();
        System.out.println();

        System.out.println("Total number of Cars " + cars.no_car);

    }
}
class cars{
    private int mo_year , engine;
    private String c_name , colour;
    int num ;
    static  int no_car = 0;
    cars(String c_name , String col , int year , int engine){
        setC_name(c_name);
        setColour(col);
        setEngine(engine);
        setMo_year(year);
        this.c_name = getC_name();
        this.colour = getColour();
        this.engine = getEngine();
        this.mo_year = getMo_year();
        num = setno_car();
       // no_car = setno_car();

    }
    public static int setno_car(){
        no_car++;
        return no_car;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getMo_year() {
        return mo_year;
    }

    public void setMo_year(int mo_year) {
        this.mo_year = mo_year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
    public void print(){
        System.out.println("Car information ");
        System.out.println();
        System.out.println("Car name: "+c_name);
        System.out.println("Car colour: "+ colour);
        System.out.println("Car engine: "+engine + " CC");
        System.out.println("Car model year: "+mo_year);
        System.out.println("number : "+num);
        System.out.println();
    }
}
