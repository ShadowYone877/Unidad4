package Model;

public class Book {
    private int numPages, year;
    private String title, author, publisher;

    public Book(int numPages, int year, String title, String author, String publisher) {
        this.numPages = numPages;
        this.year = year;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    @Override
    public String toString() {
        return "Book [numPages=" + numPages + ", title=" + title + ", author=" + author + ", publisher=" + publisher
                + "]";
    }
}
