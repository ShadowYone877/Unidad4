import Service.BookService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la biblioteca"); /* Imprime el mensaje de bienvenida */
        BookService book = new BookService();
        book.registerBook();
    }
}
