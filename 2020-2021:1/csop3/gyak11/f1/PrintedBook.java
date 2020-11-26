public class PrintedBook extends Book {
    private CoverType coverType;

    public PrintedBook() {
        // super();
        coverType = CoverType.Hardcover;
    }
    public PrintedBook(String author, String title, int pages, CoverType cover) {
        super(author, title, pages + 6);
        coverType = cover;
    }

    @Override
    public int getPrice() {
        if(coverType.equals(CoverType.Softcover)) {
            return pages*2;
        }
        return pages*3;
    }

    @Override
    public String toString() {
        if(coverType.equals(CoverType.Softcover)) {
            return super.toString() + "(soft cover)";
        }
        return super.toString() + "(hard cover)";
    }

    @Override
    public String createReference(String article, int from, int to) {
        return super.toString() + "[" + from + "-" + to + "] referenced in article:" + article;
    }

}
