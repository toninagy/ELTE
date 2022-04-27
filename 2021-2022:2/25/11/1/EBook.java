public class EBook extends Book {
    private int PDFSize;

    public EBook(String author, String title, int pages, int PDFSize) {
        super(author, title, pages);
        this.PDFSize = PDFSize;
    }

    @Override
    public int getPrice() {
        return pages + PDFSize;
    }

    @Override
    // access modifier can be less restrictive
    // return type must be ? super String
    // throws list can be more general
    public String createReference(String article, int from, int to) {
        return super.toString() + "(PDF Size: " + PDFSize + ") [" + from + "-" + to 
        + "] referenced in article: " + article;
    }

    public String createReference(String article, String date) {
        return super.toString() + "(PDF Size: " + PDFSize + ")" + "referenced in article: " 
        + article + ", accessing PDF date: " + date;
    }
}
