public class Book implements Printable {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(author + ": " + title);
    }
}
