package Service;
import Model.Book;
import java.util.Scanner;

public class BookService extends Repository.BookList {
    public void registerBook(){
        Scanner opc = new Scanner(System.in);
        Book b1 = new Book(0, 0, null, null, null);
        System.out.println("Ingresa el número de páginas: ");
        b1.setNumPages(opc.nextInt());
        System.out.println("Ingresa el año de publicación: ");
        b1.setYear(opc.nextInt());
        System.out.println("Ingresa el título del libro: ");
        b1.setTitle(opc.next());
        System.out.println("Ingresa el nombre del autor: ");
        b1.setAuthor(opc.next());
        System.out.println("Ingresa la editorial del libro: ");
        b1.setPublisher(opc.next());
        bookslist.add(b1);
        System.out.println(bookslist.toString());
    }

}
