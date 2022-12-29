package DnD2021.Q9UML1stchance;

public class Book extends Publication{
    private String author;

    public Book(String title, String author, int isbn){
        super(title,isbn);
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
}
