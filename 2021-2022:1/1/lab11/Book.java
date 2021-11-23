public class Book implements Printable {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void print() {
        System.out.println("Author: " + author + ", Title: " + title);
    }
    
}
