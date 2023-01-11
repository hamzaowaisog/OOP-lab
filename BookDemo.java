public class BookDemo {
    public static void main(String[] args) {
        book b1 = new book();
        b1.setTitle("Great Expectations");
        b1.setAuthor("Charles Dickens");
        b1.setPrice(79.75);

        b1.tostring();

    }
}

class book {

    private String title , author;
    private double price;

    public void setTitle (String tit){
        title = tit;
    }
    public void setAuthor(String auth){
        author = auth;
    }
    public void setPrice (double price1){
        price = price1;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void tostring(){
        System.out.println("title :" + title+"\nAuthor :" + author +"\nPRice :"+price);
    }



}

