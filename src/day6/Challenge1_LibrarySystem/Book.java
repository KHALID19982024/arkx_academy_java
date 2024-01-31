package day6.Challenge1_LibrarySystem;
public class Book
{
    private static String name;
    private static String author;
    private static int Release_date;

    public Book(String name, String author, int release_date)
    {
        this.author=author;
        this.name=name;
        this.Release_date= release_date;
    }
    public static void printInfo()
    {
        System.out.println("the name of the book is: "+name+"\nAuthor: "+author+"\ndate of release: "+Release_date);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        System.out.println(author);
        return author;
    }

    public int getRelease_date() {
        return Release_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRelease_date(int release_date) {
        if (Release_date> 0)
            Release_date = release_date;
    }
}
class FictionBook extends Book
{
    public FictionBook(String name, String author, int release_date)
    {
        super(name, author, release_date);
    }
}
class History extends Book
{
    public History(String name, String author, int release_date)
    {
        super(name, author, release_date);
    }
}