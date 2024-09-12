package Book;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library(){
        books = new ArrayList<Book>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public String searchByTitle(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title) && book.getAvailable()){
                return book.getTitle();
            }
        }
            throw new IllegalArgumentException("Book not found");
    }
    public String searchByISBN(String ISBN){
        for(Book book : books){
            if(book.getISBN().equals(ISBN) && book.getAvailable()){
                return book.getTitle();
            }
        }
        throw new IllegalArgumentException("Book not found");
    }

    public ArrayList<Book> searchByAuthor(String author){
        ArrayList<Book> authorBooks = new ArrayList<Book>();
        for(Book book : books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    public void allBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }
}
