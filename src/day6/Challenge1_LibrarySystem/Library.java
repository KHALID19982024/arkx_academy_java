package day6.Challenge1_LibrarySystem;
import java.util.ArrayList;
class Library
{
    ArrayList<Book> books;

    Library()
    {
        books = new ArrayList<>();
    }

    void addBook(Book book)
    {
        books.add(book);
    }

    void displayBooks()
    {
        for (Book book : books) {
            book.printInfo();
            System.out.println("------------------------------");
        }
    }
}