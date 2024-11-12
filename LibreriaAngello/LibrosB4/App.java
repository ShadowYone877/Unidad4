package UI;
import Service.BookService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Bookstore");
        BookService book = new BookService();
        book.registerBook();
    }
}
