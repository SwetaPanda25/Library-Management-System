import java.util.*;

public class User{
    private int userId;
    private String name;
    private List<Book> borrowed;

    public User(int userId, String name){
        this.userId = userId;
        this.name = name;
        this.borrowed  = new ArrayList<>();
    }

    public int getUserId(){
        return userId;
    }

    public String getName(){
        return name;
    }

    public List<Book> getBorrowed(){
        return borrowed;
    }

    public void borrowBook(Book book){
        borrowed.add(book);
    }

    public void returnBook(Book book){
        borrowed.remove(book);
    }

    @Override
    public String toString(){
        return "User "+name+" ["+userId+"], Borrowed: "+borrowed.size();
    }
}