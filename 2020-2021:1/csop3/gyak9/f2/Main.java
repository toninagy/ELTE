public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("George Orwell", "1984", 350);
        System.out.println(book1.getShortName());
        System.out.println(book2.getShortName());

        PrintedBook printedBook = new PrintedBook("author1", "title1", 100, CoverType.SoftCover);
        EBook eBook = new EBook("author1", "title1", 100, 12);

        System.out.println(printedBook.getPrice());
        System.out.println(eBook.getPrice());
        System.out.println(printedBook);
        System.out.println(eBook);
        System.out.println(eBook.createReference("articleExample", 45, 47));

        book1 = eBook;
    }
}
