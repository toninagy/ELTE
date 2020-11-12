public class PrintedBook extends Book {
    private CoverType coverType;

    public PrintedBook() {
        // super();
        this.coverType = CoverType.HardCover;
    }

    public PrintedBook(String author, String title, int pages, CoverType coverType) {
        super(author, title, pages+6);
        this.coverType = coverType;
    }

    public int getPrice() {
        if(coverType == CoverType.HardCover) {
            return 3*pages;
        }
        return 2*pages;
        // return (coverType == CoverType.HardCover) ? 3 * pages : 2 * pages;
    }

    @Override
    public String toString() {
        return super.toString() + coverType;
    }

    @Override
    public String createReference(String article, int from, int to) {
        return super.toString() + "[ " + from + "-" + to + " ] referenced in article: " + article; 
    }
    
}
