public abstract class Book {
    private String author; 
    private String title;

    protected int pages;

    protected Book() {
        author = "John Steinbeck";
        title = "Of Mice and Men";
        pages = 107;
    }

    protected Book(String author, String title, int pages) {
        if(author.length() < 2 || title.length() < 4) {
            throw new IllegalArgumentException("Either author length is less than 2 chars, or title length is less than 4 chars");
        }
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getShortName() {
        return author.substring(0,2) + ": " + title.substring(0,4) + ";" + pages;
    }

    @Override 
    public String toString() {
        return author + ": " + title + ", pages: " + pages;
    }

    public abstract String createReference(String article, int from, int to);

    public abstract int getPrice();
}