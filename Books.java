public class Books {
    protected int bk_id;
    protected String bk_name;
    protected String bk_author;
    protected int bk_isbn ;
    protected int bk_price;

    public Books(){

    }

    public Books(int bk_id, String bk_name, String bk_author, int bk_isbn, int bk_price) {
        this.bk_id = bk_id;
        this.bk_name = bk_name;
        this.bk_author = bk_author;
        this.bk_isbn = bk_isbn;
        this.bk_price = bk_price;
    }
}
