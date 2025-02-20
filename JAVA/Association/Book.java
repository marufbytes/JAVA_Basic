package Association;

public class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int avialableQuantity;

    public Book(){};

    public Book(String isbn, String bookTitle, String authorName, double price, int avialableQuantity){
    this.isbn=isbn;
    this.bookTitle=bookTitle;
    this.authorName=authorName;
    this.price=price;
    this.avialableQuantity=avialableQuantity;
    }

    public void setIsbn(String isbn ){
        this.isbn=isbn;
    }
    public String getIsbn(){
        return isbn;
    }

    public void setBookTitle(String bookTitle){
        this.bookTitle=bookTitle;
    }
    public String getBookTitle(){
        return bookTitle;
    }

    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }

    public String getAuthorName(){
        return authorName;
    }

    public void setPrice (double price){
        this.price=price;
    }
    public double getPrice (){
        return price;
    }

    public void setAvailableQuantity(int avialableQuantity){
        this.avialableQuantity=avialableQuantity;
    }
    public int getAvailableQuantity(){
        return avialableQuantity;
    }

    public void sellQuantity(int amount) {
        if (amount <= avialableQuantity) {
            this.avialableQuantity -= amount;
        } 
        
        else {
            System.out.println("Not enough books available to sell.");
        }
    }

    public void showDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Available Quantity: " + avialableQuantity);
    }
}



