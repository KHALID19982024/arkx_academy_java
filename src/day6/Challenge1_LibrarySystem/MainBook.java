package day6.Challenge1_LibrarySystem;
public class MainBook {
    public static void main(String[] args)
    {
        Book book1= new Book("Housemaid","Freida McFadden",2022);
        Book book2= new Book("Trust","Hernan DiazHernan Diaz",2023);
        Book book3= new Book("Time trials","Butler",2016);

        //Book.printInfo();
        FictionBook fictionBook1 = new FictionBook("The Seven Husbands of Evelyn Hug","Taylor Jenkins Reid",2018);
        //fictionBook1.printInfo();
        //fictionBook1.setAuthor("khalid taouti");
        //fictionBook1.getAuthor();
        Library lib1= new Library();
        lib1.addBook(fictionBook1);
        lib1.addBook(book1);
        lib1.displayBooks();
    }
}