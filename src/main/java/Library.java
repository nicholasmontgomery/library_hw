import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public boolean hasSpace(){
        return this.capacity > bookCount();
    }

    public void addBookToLibrary(Book book) {
        if(hasSpace()){
            this.bookCollection.add(book);
        }

    }


}



//    Books should have title, author and genre.
//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock.
//        Add a capacity to the library and write a method to check if stock is full before adding a book.