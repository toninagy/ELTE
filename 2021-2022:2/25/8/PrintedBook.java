public class PrintedBook extends Book {
    private CoverType coverType;

    public enum CoverType {
        Softcover, 
        Hardcover
    }

    public PrintedBook() {
        super();
        this.coverType = CoverType.Hardcover;
        pageNum += 6;
    }

    public PrintedBook(String author, String title, int pageNum, CoverType coverType) {
        super(author, title, pageNum);
        this.coverType = coverType;
    }

    public PrintedBook(String author, String title) {
        this(author, title, 100, CoverType.Softcover);
    }

    public int getPrice() {
        if(coverType == CoverType.Hardcover) {
            return 3 * pageNum;
        }
        return 2 * pageNum;
    }

    @Override 
    public String toString() {
        return super.toString() + ", cover type: " + coverType; 
    }

    @Override 
    public String createReference(String articleName, int begin, int end) {
        return super.toString() + "[" + begin + "-" + end + "] referenced in article:" + articleName;
    }

}
