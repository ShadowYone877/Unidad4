import Service.BookService;

public class App {
    public static void main(String[] args) throws Exception {

        BookService b = new BookService();

        b.registerBook();

    }
}
