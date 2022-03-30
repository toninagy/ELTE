public class Book {
    private String author;
    private String title;
    protected int pageNum;

    public Book() {
        this.author = "John Steinbeck";
        this.title = "Of Mice And Men";
        this.pageNum = 107;
    }

    public Book(String author, String title, int pageNum) {
        if(author.length() < 2 || title.length() < 4) {
            throw new IllegalArgumentException("Either author or title is invalid.");
        }
        this.author = author;
        this.title = title;
        this.pageNum = pageNum;
    }

    public String getShortName() {
        return author.substring(0, 2) + " : " + title.substring(0, 4) + " , " + pageNum;
    }

    @Override 
    public String toString() {
        return author + ":" + title + "," + pageNum;
    }

    public String createReference(String articleName, int begin, int end) {
        return getShortName() + "[" + begin + "-" + end + "] referenced in article:" + articleName;
    }

}
