public class EBook extends Book {
    private int PDFSize;

    public EBook(String author, String title, int pageNum, int PDFSize) {
        super(author, title, pageNum);
        this.PDFSize = PDFSize;
    }

    public int getPrice() {
        return pageNum + PDFSize;
    }

    @Override 
    public String createReference(String articleName, int begin, int end) {
        return super.toString() + "(PDF size: " + PDFSize + "[" + begin + "-" + end + 
          "] referenced in article:" + articleName;
    }

    public String createReference(String articleName, String date) {
        return super.toString() + "(PDF size: " + PDFSize +
          "] referenced in article: " + articleName + " accessing date: " + date;
    }
}
