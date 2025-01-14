// Base class representing a Book
class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true; // By default, the book is available
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Checked Out"));
        System.out.println();
    }
}

// Class representing a User who can borrow books
class User {
    private String name;
    private int userId;

    // Constructor
    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name + " borrowed \"" + book.getTitle() + "\" by " + book.getAuthor() + ".");
        } else {
            System.out.println("Sorry, the book \"" + book.getTitle() + "\" is currently unavailable.");
        }
    }

    // Method to return a book
    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println(name + " returned \"" + book.getTitle() + "\" by " + book.getAuthor() + ".");
    }

    // Display User information
    public void displayUserInfo() {
        System.out.println("User: " + name + " (ID: " + userId + ")");
    }
}

// Class representing the Library System
class Library {
    private Book[] books;
    private User[] users;
    private int bookCount = 0;
    private int userCount = 0;

    // Constructor
    public Library(int maxBooks, int maxUsers) {
        books = new Book[maxBooks];
        users = new User[maxUsers];
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Added book: \"" + book.getTitle() + "\" by " + book.getAuthor());
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to add a user
    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount++] = user;
            System.out.println("Added user: " + user.getName());
        } else {
            System.out.println("Library is full. Cannot add more users.");
        }
    }

    // Method to display all books
    public void displayAllBooks() {
        System.out.println("Library Books:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }

    // Method to display all users
    public void displayAllUsers() {
        System.out.println("Library Users:");
        for (int i = 0; i < userCount; i++) {
            users[i].displayUserInfo();
        }
    }
}

public class book {
    public static void main(String[] args) {
        // Create a Library
        Library library = new Library(5, 3);

        // Create some Books
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book4 = new Book("Moby Dick", "Herman Melville", 1851);
        Book book5 = new Book("Pride and Prejudice", "Jane Austen", 1813);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Create some Users
        User user1 = new User("Alice", 101);
        User user2 = new User("Bob", 102);
        User user3 = new User("Charlie", 103);

        // Add users to the library
        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);

        // Display books and users
        library.displayAllBooks();
        library.displayAllUsers();

        // User borrows and returns books
        user1.borrowBook(book1);
        user2.borrowBook(book1); // Book already borrowed
        user1.returnBook(book1);
        user2.borrowBook(book1);

        // Final library status
        library.displayAllBooks();
    }
}
