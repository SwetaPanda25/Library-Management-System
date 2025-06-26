import java.util.*;

public class Library{
    private List<Book> books;
    private List<User> users;

    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Added book: "+book);
    }

    public void addUser(User user){
        users.add(user);
        System.out.println("Added user: "+user);
    }

    public void listBooks(){
        for(Book b : books){
            System.out.println(b);
        }
    }

    public void listUsers(){
        for(User u : users){
            System.out.println(u);
        }
    }

    public Book findBookById(int id){
        for(Book b : books){
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }

    public User findUserById(int id){
        for(User u : users){
            if(u.getUserId() == id){
                return u;
            }
        }
        return null;
    }

    public void borrowBook(int userId, int bookId){
        User u = findUserById(userId);
        Book b = findBookById(bookId);

        if(u == null || b == null){
            System.out.println("User or book not found!");
            return;
        }
        if(!b.isAvailable()){
            System.out.println("Book already borrowed.");
            return;
        }
        u.borrowBook(b);
        b.setAvailable(false);
        System.out.println(u.getName()+" borrowed "+ b.getTitle());
    }

     public void returnBook(int userId, int bookId) {
        User user = findUserById(userId);
        Book book = findBookById(bookId);

        if (user == null || book == null) {
            System.out.println("User or Book not found!");
            return;
        }

        if (!user.getBorrowed().contains(book)) {
            System.out.println("User didn't borrow this book.");
            return;
        }

        user.returnBook(book);
        book.setAvailable(true);
        System.out.println(user.getName() + " returned " + book.getTitle());
    }
}