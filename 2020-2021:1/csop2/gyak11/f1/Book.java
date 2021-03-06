public abstract class Book {
    private String author;
    private String title;
    protected int pages;

    protected Book() {
        this.author = "John Steinbeck";
        this.title = "Of Mice and Men";
        this.pages = 107;
    }

    protected Book(String author, String title, int pages) {
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
        return this.author.substring(0,2) + ":" + this.title.substring(0,4) + ". " + pages;
    }

    @Override
    public String toString() {
        return author + ": " + title + "; pages: " + pages;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String createReference(String article, int from, int to);

    public abstract int getPrice();
}
