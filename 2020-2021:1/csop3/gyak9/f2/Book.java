public class Book {
    private String author;
    private String title;
    protected int pages;

    public Book() {
        this.author = "John Steinbeck";
        this.title = "Of Mice and Men";
        this.pages = 107;
    }

    public Book(String author, String title, int pages) {
        if(author.length() < 2) {
            throw new IllegalArgumentException("Author length is less than 2");
        }
        if(title.length() < 4) {
            throw new IllegalArgumentException("Title length is less than 4");
        }
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getShortName() {
        return author.substring(0,2) + ", " + title.substring(0,4) + ": " + pages;
    }

    @Override
    public String toString() {
        return author + ", " + title + ": " + pages;
    }

    public String createReference(String article, int from, int to) {
        return getShortName() + "[ " + from + "-" + to + " ] referenced in article: " + article; 
    }


}
