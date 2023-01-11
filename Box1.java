import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {



        //a
        box b1 = new box(8,-10);
        b1.print();

        //b
        box b2 = new box(3);
        b2.print();

        //c
        box b3 = new box();
        b3.print();


    }
}

class box{
    Scanner sc = new Scanner (System.in);
    int width , height ;

     box(box obj){
        this.width = obj.width;
        this.height = obj.height;
    }


    void print(){
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
        System.out.println("\n");
    }

    //a

    box (int wid , int hei ){
        if(wid<0){
            System.out.println("Width is negative so width is set to 0 ");
            width =0 ;

        }
        else
        {
            this.width = wid;
        }
        if(hei<0){

            System.out.println("Height is negative so height is set to 0");
            height = 0 ;
        }
        else{
            this.height = hei;
        }
    }

    //b

    box (int hei){
        this.height = hei;
        System.out.println("Enter the width of the box");
        setWidth(sc.nextInt());
    }

    void setWidth (int width1){
        this.width = width1;
    }

    //c

    box (){
        System.out.println("Enter the height of the box");
        setHeight(sc.nextInt());
        System.out.println("Enter the width of the box");
        setWidth(sc.nextInt());
    }

    void setHeight(int height1){
        this.height = height1;
    }

}

