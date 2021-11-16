public class EBook extends Book {

    private int fileSize;

    public EBook(String author, String title, int pages, int fileSize) {
        super(author, title, pages);
        this.fileSize = fileSize;
    }
    
    public int getPrice() {
        return pages + fileSize;
    }

    @Override
    public String createReference(String articleName, int startPage, int endPage) {
        return super.toString() + "(" + fileSize + ")" + "[" + startPage + "," + endPage + "]" + "referenced in article: " + articleName;
    }

    public String createReference(String articleName, String date) {
        return super.toString() + "(" + fileSize + ")" + "referenced in article: " + articleName + ", accessing date: " + date;
    }
}
