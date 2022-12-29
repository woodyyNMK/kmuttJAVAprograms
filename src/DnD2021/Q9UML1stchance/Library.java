package DnD2021.Q9UML1stchance;
import java.util.ArrayList;
public class Library {
    private String name;
    private ArrayList<Publication> publications = new ArrayList<>();

    public Library(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void add(Publication p){
        if(publications.contains(p)){
            System.out.println("The item already exists.");
        }else{
            publications.add(p);
        }
    }
    public void remove(Publication p){
        if(!publications.contains(p)){
            System.out.println("The item does not exist.");
        }else{
            publications.remove(p);
        }
    }
    public void listItem(){
        for(Publication p:publications){
            System.out.println(p.getTitle());
        }
    }
    public int getSize(){
        return publications.size();
    }
}
