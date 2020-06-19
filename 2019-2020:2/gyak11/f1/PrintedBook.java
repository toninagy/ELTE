public class PrintedBook extends Book {
    CoverType coverType;

    public PrintedBook() {
        // super();
        this.pages += 6;
        this.coverType = CoverType.HardCover;
    }

    public PrintedBook(String author, String title, int pages, CoverType ct) {
        super(author, title, pages + 6);
        coverType = ct;
    }

    public int getPrice() {
        if(coverType == CoverType.HardCover) {
            return pages*3;
        }
        return pages*2;
    }

    @Override
    public String toString() {
        if(coverType == CoverType.HardCover) {
            return super.toString() + "(hard cover)";
        }
        return super.toString() + "(soft cover)";
    }

    @Override 
    public String createReference(String article, int from, int to) {
        return super.toString() + "[" + from + "-" + to + "] referenced in article " + article;
    }

}