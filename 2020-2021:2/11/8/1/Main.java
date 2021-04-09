public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("abc", "abcd", 500);

        System.out.println(b1.getShortName());
        System.out.println(b2.getShortName());

        PrintedBook pbook1 = new PrintedBook();
        EBook ebook1 = new EBook("axc", "abxd", 504, 20);

        System.out.println(pbook1.getShortName());
        System.out.println(ebook1.getShortName());
        System.out.println(pbook1.getPrice());
        System.out.println(ebook1.getPrice());

        b1 = new PrintedBook();
        b1.getShortName();

        b2 = new EBook("axc", "abxd", 504, 20);
        // b2.createReference("afd", "2021-04-09");
        ebook1.createReference("afd", "2021-04-09");
        b2.createReference("article", 10, 20);
    }
}
