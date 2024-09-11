package Book;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
       return author;
    }
    public String getISBN() {
       return ISBN;
    }
    public boolean getAvailable() {
        return isAvailable;
    }
    public void setisAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + isAvailable;
    }
}



