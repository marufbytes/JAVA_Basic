public class Library {
    
    private String name;
    private String author;
    private int year;
    private String publisher;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
   public void setYear(int year){
    this.year=year;
   }
   public int getYear(){
    return year;
   }
   public void setPublisher(String publisher){
    this.publisher=publisher;
   }
   public String getPublisher(){
    return publisher;
   }

    Library (){};

    Library(String name, String author, int year, String publisher){
        this.name=name;
        this.author=author;
        this.year=year;
        this.publisher=publisher;
    }

    public void addBook(String name, String author){
        this.name=name;
        this.author=author;
    }

    public void addBook(String name, String author, int year){
        this.name=name;
        this.author=author;
        this.year=year;
    }

    public void addBook(String name, String author, int year, String publisher){
        this.name=name;
        this.author=author;
        this.year=year;
        this.publisher=publisher;
    }

   public void display(){
   if(publisher==null && year==0 && author!=null && this.name!=null)
   {
    System.out.println("Name :"+name);
    System.out.println("Author :"+author);
   }
   else if (publisher == null && year!=0 && name!=null && author!=null){
    System.out.println("Name :"+name);
    System.out.println("Author :"+author);
    System.out.println("Year : "+year);
   }

   else if (publisher!=null && year!=0 && author!=null && name!=null){
    System.out.println("Name :"+name);
    System.out.println("Author :"+author);
    System.out.println("Year : "+year);
    System.out.println("Publisher : "+publisher);
   }
   }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Shakib ", "BKGB");
        library.display();
        library.addBook("Selim ","RKHFG", 2004);
        library.display();
        library.addBook("Mubarak", "RJFWH", 700, "Karim");
        library.display();
    }
   
}
