package Library;

public class Book extends LibraryItem {
    private String ISBN;

   public Book(String title, String author, int year, String ISBN) {
       super(title, author, year);
   }

   public String getISBN() {
       return ISBN;
   }
   public void setISBN(String ISBN) {
       this.ISBN = ISBN;
   }
}
