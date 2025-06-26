import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Adding some books and users
        library.addBook(new Book(101, "India of My Dreams", "Mahatma Gandhi"));
        library.addBook(new Book(102, "1984", "George Orwell"));
        library.addUser(new User(1, "Preet"));
        library.addUser(new User(2, "Baddy"));

        while (true) {
            System.out.println("\nLibrary Menu:\n");
            System.out.println("1. List Books");
            System.out.println("2. List Users");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    library.listUsers();
                    break;
                case 3:
                    System.out.print("Enter user ID: ");
                    int userId = sc.nextInt();
                    System.out.print("Enter book ID: ");
                    int bookId = sc.nextInt();
                    library.borrowBook(userId, bookId);
                    break;
                case 4:
                    System.out.print("Enter user ID: ");
                    userId = sc.nextInt();
                    System.out.print("Enter book ID: ");
                    bookId = sc.nextInt();
                    library.returnBook(userId, bookId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
