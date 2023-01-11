public class Q4 {
    public static void main(String[] args) {
        Category1 c1 = new Category1(1001 , "Harry Potter" , "J.K. Rowlings" ,123587,365,"Fiction");
        Category1 c2 = new Category1(1002 , "Learn to do Java" , "Harshid gibbs" ,139874,500,"Non-Fiction , Porgramming");
        Category1 c3 = new Category1(1003 , "Politics of World" , "Sikender Mirza" ,98657,400,"Political Science");

        System.out.println("Book1");
        c1.display();
        System.out.println();
        System.out.println("Book2");
        c2.display();
        System.out.println();
        System.out.println("Book3");
        c3.display();

        Books b1 = new Books();
        b1 =c3;


        System.out.println();
        System.out.println("Class has been Upcasted ");






    }
}
