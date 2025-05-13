import java.util.*;

class Book{
    private String title;
    private String author;
    private String genre;
    private double price;

    public Book(String title, String author, String genre, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class BookStore {
    private ArrayList<Book> books;

    public BookStore() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void editBook(int index, Book book) {
        if (index >= 0 && index < books.size()) {
            books.set(index, book);
            System.out.println("Book updated successfully.");
        } else {
            System.out.println("Invalid book index.");
        }
    }

    public void deleteBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Invalid book index.");
        }
    }

    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                found = true;
                System.out.println("Book found:");
                printBookDetails(book);
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found in the bookstore.");
        } else {
            System.out.println("All books in the bookstore:");
            for (Book book : books) {
                printBookDetails(book);
                System.out.println("------------------------");
            }
        }
    }

    private void printBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Genre: " + book.getGenre());
        System.out.println("Price: $" + book.getPrice());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore bookstore = new BookStore();

        while (true) {
            System.out.println("\n---- Bookstore Menu ----");
            System.out.println("1. Add Book");
            System.out.println("2. Edit Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Search Book");
            System.out.println("5. Print All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter book price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    Book newBook = new Book(title, author, genre, price);
                    bookstore.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter the index of the book to edit: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter updated book title: ");
                    String updatedTitle = scanner.nextLine();
                    System.out.print("Enter updated book author: ");
                    String updatedAuthor = scanner.nextLine();
                    System.out.print("Enter updated book genre: ");
                    String updatedGenre = scanner.nextLine();
                    System.out.print("Enter updated book price: ");
                    double updatedPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    Book updatedBook = new Book(updatedTitle, updatedAuthor, updatedGenre, updatedPrice);
                    bookstore.editBook(editIndex, updatedBook);
                    break;

                case 3:
                    System.out.print("Enter the index of the book to delete: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    bookstore.deleteBook(deleteIndex);
                    break;

                case 4:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();

                    bookstore.searchBook(searchTitle);
                    break;

                case 5:
                    bookstore.printAllBooks();
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
