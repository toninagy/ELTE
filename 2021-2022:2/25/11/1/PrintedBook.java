public class PrintedBook extends Book {
    public enum Cover {
        Softcover, Hardcover
    }
    private Cover cover;

    public PrintedBook() {
        // super();
        cover = Cover.Hardcover;
        pages += 6;
    }

    public PrintedBook(String author, String title, int pages, Cover cover) {
        super(author, title, pages + 6);
        this.cover = cover;
    }

    @Override
    public int getPrice() {
        if(cover == Cover.Softcover) {
            return 2 * pages;
        }
        return 3 * pages;
    }

    @Override
    public String toString() {
        return super.toString() + cover.name();
    }

    @Override
    public String createReference(String article, int from, int to) {
        return super.toString() + "[" + from + "-" + to + "] referenced in article: " + article;
    }

}
