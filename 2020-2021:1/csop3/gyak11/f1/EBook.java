public class EBook extends Book {
    private int fileSize;

    public EBook(String author, String title, int pages, int fileSize) {
        super(author, title, pages);
        this.fileSize = fileSize;
    }

    @Override
    public int getPrice() {
        return pages + fileSize;
    }

    @Override
    public String createReference(String article, int from, int to) {
        return super.toString() + "(PDF size:" + fileSize + " )[" + from + "-" + to + "] referenced in article:" + article;
    }

    public String createReference(String article, String date) {
        return super.toString() + "(PDF size:" + fileSize + " ) referenced in article: " 
            + article + ", accessing date: " + date;
    }
}
