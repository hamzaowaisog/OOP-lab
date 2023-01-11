public class Q3 {
    public static void main(String[] args) {
        double a1,a2,a3,a4,v1,v2,v3,v4;
        int a11,a22,a33,a44,v11,v22,v33,v44;

        System.out.println("With default constructor");
        Cylinder c1 = new Cylinder();

        a1 = c1.getArea();
        v1 = c1.getvolume();
        System.out.println(c1.toString());
        System.out.println("Area and Volume in double ");
        System.out.println(a1+" "+v1);
        a11 = (int)a1;
        v11 = (int)v1;
        System.out.println("Area and Volume in integer");
        System.out.println(a11+" "+v11);

        System.out.println();
        System.out.println("With constructor");
        Cylinder c2 = new Cylinder(3.6);
        a2 = c2.getArea();
        v2 = c2.getvolume();
        System.out.println(c2.toString());
        System.out.println("Area and Volume in double ");
        System.out.println(a2+" "+v2);
        a22 = (int)a2;
        v22 = (int)v2;
        System.out.println("Area and Volume in integer");
        System.out.println(a22+" "+v22);

        System.out.println();
        System.out.println("With another constructor");
        Cylinder c3 = new Cylinder(4.5 , 3.6);
        a3 = c3.getArea();
        v3 = c3.getvolume();
        System.out.println(c3.toString());
        System.out.println("Area and Volume in double ");
        System.out.println(a3+" "+v3);
        a33 = (int)a3;
        v33 = (int)v3;
        System.out.println("Area and Volume in integer");
        System.out.println(a33+" "+v33);

        System.out.println();
        System.out.println("With another constructor ");
        Cylinder c4 = new Cylinder(2.3 , 6.9 , "blue");
        a4 = c4.getArea();
        v4 = c4.getvolume();
        System.out.println(c4.toString());
        System.out.println("Area and Volume in double ");
        System.out.println(a4+" "+v4);
        a44 = (int)a4;
        v44 = (int)v4;
        System.out.println("Area and Volume in integer");
        System.out.println(a44+" "+v44);


    }
}
