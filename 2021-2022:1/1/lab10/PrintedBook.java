public class PrintedBook extends Book {

    enum CoverType {
        Softcover,
        Hardcover
    }

    private CoverType coverType;

    public PrintedBook() {
        // super();
        pages += 6;
        coverType = CoverType.Hardcover;
    }

    public PrintedBook(String author, String title, int pages, CoverType coverType) {
        super(author, title, pages);
        this.coverType = coverType;
    }

    public int getPrice() {
        return coverType == CoverType.Hardcover ? pages*3 : pages*2;
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + coverType +  " ) ";
    }

    @Override
    public String createReference(String articleName, int startPage, int endPage) {
        return super.toString() + "[" + startPage + "," + endPage + "]" + "referenced in article: " + articleName;
    }
}