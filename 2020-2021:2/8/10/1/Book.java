public class Book {
    private String author, title;
    protected int pages;

    public Book() {
        author = "John Steinbeck";
        title = "Of Mice and Men";
        pages = 107;
    }

    public Book(String author, String title, int pages) {
        if(author.length() < 2 || title.length() < 4) {
            throw new IllegalArgumentException("Either author length is less than 2 characters " + 
            "or title length is less than 4 characters");
        }
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getShortName() {
        return author.substring(0,2) + ": " + title.substring(0,4) + "; " + pages;
    }

    @Override 
    public String toString() {
        return author + ":" + title + ", pages: " + pages; 
    }

    public String createReference(String article, int from, int to) {
        return getShortName() + "[" + from + "-" + to + "] referenced in article: " + article; 
    }

    public int getPages() {
        return pages;
    }

}