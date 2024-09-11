package Book;

import java.util.Scanner;

public class BookMain {
    private static Scanner input = new Scanner(System.in);
    static Library lib = new Library();
    static Book book;


    public static void main(String[] args) {

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "1", true);
        lib.addBook(book1);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "2", true);
        lib.addBook(book2);
        Book book3 = new Book("1984", "George Orwell", "3", false);
        lib.addBook(book3);
        Book book4 = new Book("The Great Gatsby", "F. Scoot Fitzgerald", "4", true);
        lib.addBook(book4);
        showMenu();
    }

    public static void showMenu() {
//        while(true) {
//            System.out.println("Library Menu");
//            System.out.println("1. List of all Books");
//            System.out.println("2. Search for a book by title");
//            System.out.println("3. Search for a book by author");
//            System.out.println("4. Search for a book by ISBN");
//            System.out.println("5. Exit");
        String menuBar = """
                Library Menu
                   1. List of all Books
                   2. Search for a book by title
                   3. Search for a book by author
                   4. Search for a book by ISBN
                   5. Exit
                """;
        System.out.println(menuBar);


        System.out.print("Enter your choice: ");
        int choice = input.nextInt();


        switch (choice) {
            case 1:
                allBooks();
                showMenu();
            case 2:
                searchByTitle();
//                System.out.print("Enter title: ");
//                String title = input.next();
//                lib.searchByTitle(title);
//                showMenu();
            case 3:
//                System.out.print("Enter author: ");
//                String author = input.next();
                searchByAuthor();
//                showMenu();
            case 4:
//                System.out.print("Enter ISBN: ");
//                String ISBN = input.next();
                searchByISBN();
//                showMenu();
            case 5:
                exit();
//                showMenu();

        }
    }

    public static void allBooks() {
        lib.allBooks();
        showMenu();
    }
    private static void searchByTitle(){
        System.out.print("Enter title: ");
        String title = input.next();
        lib.searchByTitle(title);
        book = new Book(title);
        System.out.printf("The book %s is avaialable.\n",book.getTitle());
        showMenu();
    }

    private static void searchByAuthor(){
        System.out.print("Enter author: ");
        String author = input.next();
        lib.searchByAuthor(author);
        showMenu();
    }

    private static void searchByISBN(){
        System.out.print("Enter ISBN: ");
        String ISBN = input.next();
        lib.searchByISBN(ISBN);
        showMenu();
    }

    private static void exit(){
        System.out.println("Goodbye!");
        System.exit(0);
        showMenu();
    }


//        System.out.println("All Books available in the Library");
//        lib.allBooks();
//
//        System.out.println("Search for a book in our Library");
//        String search = input.next();

//        String searchTitle = "The Catcher in the Rye";
//        Book bookTitle = lib.searchByTitle(searchTitle);
//        if (bookTitle != null) {
//            System.out.println(bookTitle.getTitle());
//        } else{
//            System.out.println("No book found with that title" + searchTitle);
//        }
//
//        String searchAuthor = "George Orwell";
//        ArrayList<Book> authorBooks = lib.searchByAuthor(searchAuthor);
//        if (authorBooks != null) {
//            for (Book book : authorBooks) {
//                System.out.println(book.getTitle());
//            }
//        }else {
//            System.out.println("No book found with that author" + searchAuthor);
//        }
//
//        String searchISBN = "4";
//        Book bookISBN = lib.searchByISBN(searchISBN);
//        if (bookISBN != null) {
//            System.out.println(bookISBN.getTitle());
//        } else {
//            System.out.println("No book found with that ISBN" + searchISBN);
//        }
    }

