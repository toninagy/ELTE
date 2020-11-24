public class Main {

    public static boolean isSameAuthor(Book book1, Book book2) {
        return book1.getAuthor().equals(book2.getAuthor());
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.getShortName());
        Book book2 = new Book("George Orwell", "1984", 600);
        System.out.println(book2.getShortName());

        PrintedBook pbook1 = new PrintedBook("author", "title", 200, CoverType.Hardcover);
        EBook ebook1 = new EBook("author", "title1", 400, 5);
        book1 = ebook1;
        System.out.println(pbook1);
        System.out.println(ebook1);
        System.out.println(book1);

        System.out.println(isSameAuthor(pbook1,ebook1));

    }
}
