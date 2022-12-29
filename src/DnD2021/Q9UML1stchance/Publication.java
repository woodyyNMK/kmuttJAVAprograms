package DnD2021.Q9UML1stchance;

public abstract class Publication {
    private String title;
    private int isbn;

    public Publication(String title,int isbn){
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getIsbn(int isbn){
        return isbn;
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
}
