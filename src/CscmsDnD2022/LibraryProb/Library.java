package CscmsDnD2022.LibraryProb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Library {
    private String name;
    private ArrayList<Employee> employees;
    private ArrayList<Book> books;

    public Library(String name){
        this.name = name;
        employees = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }
    public boolean removeEmployee(int id){
        boolean include = false;
        for(Employee e:employees){
            if(e.getId()==id){
                employees.remove(e);
                include =  true;
            }
        }
        return include;
    }
    public int getNumberOfEmployees(){
        return employees.size();
    }
    public double getTotalSalary(){
        int sum=0;
        for(Employee e:employees){
            sum += e.getSalary();
        }
        return sum;
    }
    public void addBook(Book b){
        books.add(b);
        Comparator<Book>compareById=Comparator.comparing(Book::getId);
    }
    public void printInfoOfAllBooks(){
        for(int i=0;i<this.books.size();i++){
            System.out.println("(id: "+this.books.get(i).getId()+", name : "+this.books.get(i).getName()+")");
        }
    }
    public int searchBookByName(String name){
        int count=0;
        for(Book b :books){
            if(b.getName().equals(name))
                count++;
        }
        if(count==0)
            return 0;
        else
            return count;
    }
    public int searchBookById(int id){
        boolean include = false;
        for(Book b:books){
            if(b.getId() == id){
                include = true;
            }
        }
        if(include)
            return 1;
        else
            return 0;
    }
    public Book borrowBook(int id){
        boolean include = false;
        Book a = new Book(id, name);
        for(Book b:books){
            if(b.getId() == id){
                books.remove(b);
                a=b;
                include = true;
            }
        }
        if(include)
            return a;
        else 
            return null;
    }
    public void returnBook(Book b){
        this.addBook(b);
    }
    public int getAmountOfBooks(){
        return books.size();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
