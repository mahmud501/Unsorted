package classwork;
public class Book {

    protected int pages;

    Book(int numPages) {
        pages = numPages;
    }

    public void message() {
        System.out.println("Number of pages: " + pages); 
    }
}
