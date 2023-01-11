public class Category1 extends Books{

    protected String category ;

    public Category1(){

    }

    public Category1(int bk_id, String bk_name, String bk_author, int bk_isbn, int bk_price, String category) {
        super(bk_id, bk_name, bk_author, bk_isbn, bk_price);
        this.category = category;
    }

    public void display (){
        System.out.println("Book ID : "+ bk_id);
        System.out.println("Book name : " + bk_name);
        System.out.println("Book ISBN : " + bk_isbn);
        System.out.println("Book Author : "+ bk_author);
        System.out.println("Book Category : "+ category);
        System.out.println("Book Price : "+ bk_price);
    }
}
