package Service;

import Model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {

    public final List<Book> bookList = new ArrayList<>();

    public void registerBook() {

        Scanner op = new Scanner(System.in);

        Book newBook = new Book();

        System.out.println("Ingresa el número de páginas: ");
        newBook.setNumPages(op.nextInt());

        System.out.println("Ingresa el año de publicación: ");
        newBook.setYear(op.nextInt());

        System.out.println("Ingresa el título del libro: ");
        newBook.setTitle(op.next());

        System.out.println("Ingresa el nombre del autor: ");
        newBook.setAuthor(op.next());

        System.out.println("Ingresa la editorial del libro: ");
        newBook.setPublisher(op.next());

        bookList.add(newBook);

        System.out.println("Libro agregado exitosamente! ");

        for (Book books : bookList) {

            System.out.println(books);

        }

    }

}
