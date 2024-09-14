package Library;

import java.util.ArrayList;

public class Library {
    ArrayList<LibraryItem> items;
    public Library() {
        items = new ArrayList<LibraryItem>();
    }
    public void addItem(LibraryItem item) {
        items.add(item);
    }
    public void removeItem(LibraryItem item) {
        items.remove(item);
    }
    public void display() {
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java programming", "Paul Dietel", 2006, "Book-No1");
        Magazine magazine1 = new Magazine("Forbes", "Forbes Publisher", 2025, 101);
        library.addItem(book1);
        library.addItem(magazine1);

//        System.out.println(book1);
//        System.out.println(magazine1);

        library.display();
    }
}
