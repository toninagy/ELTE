public class Book {
    private String author;
    private String title;
    protected int pages;

    public Book() {
        author = "John Steinback";
        title = "Of Mice and Men";
        pages = 107;
    }

    public Book(String author, String title, int pages) {
        if(author.length() < 2 || title.length() < 4) {
            throw new IllegalArgumentException();
        }
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getShortName() {
        return author.substring(0, 2) + ": " + title.substring(0, 4) + ", " + pages;
    }

    @Override
    public String toString() {
        return author + ": " + title + ", " + pages;
    }

    public String createReference(String articleName, int startPage, int endPage) {
        return getShortName() + "[" + startPage + "," + endPage + "]" + "referenced in article: " + articleName;
    }

}
