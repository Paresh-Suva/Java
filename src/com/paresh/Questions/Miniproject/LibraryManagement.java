package com.paresh.Miniproject;

import java.util.*;

/* Book com.paresh.Interface */
interface Book {
    /* Only Methods Are Declared Not In Used */
    String getBookName(); // Taking Book Name From User
    String getBookAuthor(); // Taking Author Name From User
    int getBookId(); // Taking Book ID From User
    double getBookPrice(); // Taking Book Price From User
}

/* Implementing Book com.paresh.Interface */
class AssignBookDetails implements Book {
    /* Storing Details Of Books */
    private String bookName; // Storing Book Name
    private String bookAuthor; // Storing Book Author
    private int bookId; // Storing Book ID
    private double bookPrice; // Storing Book Price

    // Constructor Method To Initialize The Attribute Of Class
    public AssignBookDetails(String bookName, String bookAuthor, int bookId, double bookPrice) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookPrice = bookPrice;
    }

    // Getter Method To Receive The Value of Book Name
    @Override
    public String getBookName() {
        return bookName;
    }

    // Getter Method To Receive The Value of Book Author
    @Override
    public String getBookAuthor() {
        return bookAuthor;
    }

    // Getter Method To Receive The Value of Book Id
    @Override
    public int getBookId() {
        return bookId;
    }

    // Getter Method To Receive The Value of BookPrice
    @Override
    public double getBookPrice() {
        return bookPrice;
    }

    // toString Method To Display All Book Details
    @Override
    public String toString() {
        return bookName + " by " + bookAuthor + " (ID: " + bookId + ", Price: " + bookPrice + ")";
    }
}

/* MEMBER CLASS FOR STORING DETAILS OF MEMBER */
class Member {

    // Variables To Store Data
    private String memberName; // Storing Member Name
    private int memberId; // Storing Member Id
    /* ArrayList That Can Store Object of Book */
    private ArrayList<Book> borrowedBooks = new ArrayList<>(); // borrowedBooks Is Variable Name Of ArrayList

    // Constructor Method To Initialize The Attribute Of Class
    public Member(String memberName, int memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    // Getter Method To Receive The Value of Member Name
    public String getMemberName() {
        return memberName;
    }

    // Getter Method To Receive The Value of Member Id
    public int getMemberId() {
        return memberId;
    }

    // Getter Method To Receive The Value of Borrowed Books
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Method For Borrowing Book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Method For Returning Book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // toString Method To Display All Member Details
    @Override
    public String toString() {
        return memberName + " (ID: " + memberId + ")";
    }
}

/* LIBRARY CLASS */
class Library {
    // Variables To Store List Of Books And Members
    private ArrayList<Book> books = new ArrayList<>(); // books Is Variable Name Of ArrayList
    private ArrayList<Member> members = new ArrayList<>(); // members Is Variable Name Of ArrayList

    // Method To Add Book
    public void addBook(Book book) {
        if (findBookById(book.getBookId()) == null) { // Check for duplicate ID
            books.add(book);
        } else {
            System.out.println("Error: Book with this ID already exists.");
        }
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                return book;
            }
        }
        return null;
    }

    // Method To Find Book By Title
    public Book findBookByTitle(String title) {
        title = title.trim(); // Remove leading/trailing spaces from title
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Method To Add Member
    public void addMember(Member member) {
        if (findMemberById(member.getMemberId()) == null) { // Check for duplicate ID
            members.add(member);
        } else {
            System.out.println("Error: Member with this ID already exists.");
        }
    }

    // Method To Find Member By Id
    public Member findMemberById(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }

    // Method To Borrow Book
    public void borrowBook(Member member, Book book) {
        if (books.contains(book)) { // Use contains() for reliable book check
            books.remove(book);
            member.borrowBook(book);
            System.out.println(book.getBookName() + " borrowed by " + member.getMemberName());
        } else {
            System.out.println(book.getBookName() + " is not available.");
        }
    }

    // Method To Return Book
    public void returnBook(Member member, Book book) {
        System.out.println("Attempting to return book: " + book.getBookName() + " by member: " + member.getMemberName());
        System.out.println("Member's borrowed books: " + member.getBorrowedBooks());
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            books.add(book);
            System.out.println(book.getBookName() + " returned by " + member.getMemberName());
        } else {
            System.out.println(member.getMemberName() + " did not borrow " + book.getBookName());
        }
    }

    // Method To List Available Books
    public void listAvailableBooks() {
        System.out.println("\n--- Available Books ---");
        if (books.isEmpty()) { // Check books List Is Empty ??. If YES Then ...
            System.out.println("No books available.");
        } else { // If Books Are Available In List Then Print All Available Books
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Method To List Members
    public void listMembers() {
        System.out.println("\n--- Library Members ---");
        if (members.isEmpty()) { // Check members List Is Empty ??. If YES Then ...
            System.out.println("No members yet.");
        } else { // If Members Are Available In List Then Print All Members
            for (Member member : members) {
                System.out.println(member);
            }
        }
    }
}
/* MAIN CLASS */
public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library(); //  New Object Of Library Class
        Scanner scanner = new Scanner(System.in);
        

        // --- Book Input ---
        System.out.println("Enter book details (or type 'DONE' to end): ");
        while (true) {
            System.out.print("Book Name: ");
            String bookName = scanner.nextLine();
            // If User Type DONE, Loop Will Be Stopped Otherwise It Will Execute Again
            if (bookName.equalsIgnoreCase("DONE")) break;

            System.out.print("Book Author: ");
            String bookAuthor = scanner.nextLine();

            int bookId;
            while (true) { // Input validation loop for bookId
                System.out.print("Book ID: ");
                if (scanner.hasNextInt()) {
                    bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer for Book ID.");
                    scanner.nextLine();
                }
            }

            double bookPrice;
            while (true) { // Input validation loop for bookPrice
                System.out.print("Book Price: ");
                if (scanner.hasNextDouble()) {
                    bookPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number for Book Price.");
                    scanner.nextLine();
                }
            }

            library.addBook(new AssignBookDetails(bookName, bookAuthor, bookId, bookPrice));
        }

        // --- Member Input ---
        System.out.println("\nEnter member details (or type 'done'):");
        while (true) {
            System.out.print("Member Name: ");
            String memberName = scanner.nextLine();
            // If User Type DONE, Loop Will Be Stopped Otherwise It Will Execute Again
            if (memberName.equalsIgnoreCase("done")) break;

            int memberId;
            while (true) { // Input validation loop for memberId
                System.out.print("Member ID: ");
                if (scanner.hasNextInt()) {
                    memberId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer for Member ID.");
                    scanner.nextLine();
                }
            }

            library.addMember(new Member(memberName, memberId));
        }

        // --- Library Operations ---
        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. List Of Available Books");
            System.out.println("2. List Of  Members");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) { // Check for valid integer input
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
                continue; // Go to next loop iteration
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.listAvailableBooks();
                    break;
                case 2:
                    library.listMembers();
                    break;
                case 3: // Borrow Book
                    System.out.print("Enter Member ID: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Member ID input.");
                        scanner.nextLine();
                        break; // Important: Exit the case early
                    }
                    int borrowMemberId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book Title to borrow: ");
                    String borrowBookTitle = scanner.nextLine();

                    Member borrowMember = library.findMemberById(borrowMemberId);
                    Book borrowBook = library.findBookByTitle(borrowBookTitle);

                    if (borrowMember != null && borrowBook != null) {
                        library.borrowBook(borrowMember, borrowBook);
                    } else {
                        System.out.println("Invalid member ID or book title.");
                    }
                    break;

                case 4: // Return Book
                    System.out.print("Enter Member ID: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Member ID input.");
                        scanner.nextLine();
                        break; // Important: Exit the case early
                    }
                    int returnMemberId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book Title to return: ");
                    String returnBookTitle = scanner.nextLine();

                    Member returnMember = library.findMemberById(returnMemberId);
                    Book returnBook = library.findBookByTitle(returnBookTitle);

                    System.out.println("Return Member: " + returnMember);
                    System.out.println("Return Book: " + returnBook);

                    if (returnMember != null && returnBook != null) {
                        library.returnBook(returnMember, returnBook);
                    } else {
                        System.out.println("Invalid member ID or book title.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}