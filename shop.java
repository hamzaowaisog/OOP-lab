import java.util.*;

public class shop {
    public static void main(String[] args) {
        int price =0;
        stationary_shop s1 = new stationary_shop();
        s1.invoice();
        System.out.println();
        System.out.println();


        price = s1.bill();
        System.out.println("The total amount of the item is "+price);


    }
}
class stationary_shop{
    int mat[][]=stock();
    public int[][] stock(){
        int material [][] = {{1,20},{2,25}};

        return material;
    }

    public int bill (){
        Scanner sc = new Scanner(System.in);
        int total =0;
        int quantity =0;
        for(int i=0;i<mat.length;i++){
            System.out.println("Enter the quantity of the product "+(i+1));
            quantity = sc.nextInt();
            total = total+(quantity*mat[i][1]);
        }
        return total;

    }
    public void invoice (){
        System.out.println("Product Code     Price/product");
        for (int i[]: mat){
            for (int j : i){
                System.out.print(j+"                   ");
            }
            System.out.println();
        }
    }

}
