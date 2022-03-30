public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("abc", "deff", 200);
        System.out.println(b1.getShortName());
        System.out.println(b2.getShortName());
        System.out.println();
        PrintedBook pbook1 = new PrintedBook();
        System.out.println(pbook1.getShortName());
        System.out.println(pbook1.getPrice());

        EBook ebook1 = new EBook("abc", "qqqq", 100, 15);
        System.out.println(ebook1.getShortName());
        System.out.println(ebook1.getPrice());
        System.out.println(ebook1.toString());
        System.out.println(pbook1.toString());

        b1 = new PrintedBook();
        // b1.getShortName();
        System.out.println(b1.toString());
        b2 = new EBook("abc", "sssq", 101, 16);
        System.out.println(b2.toString());

        System.out.println(ebook1.createReference("articlename", "2021/4/8"));
        System.out.println(b2.createReference("articlename", 10, 20));
    }
}
