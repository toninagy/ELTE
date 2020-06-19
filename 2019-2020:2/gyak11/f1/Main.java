public class Main {
    public static void main(String[] args)
    {
        PrintedBook pbook = new PrintedBook("author", "Printed: Title", 100, CoverType.SoftCover);
        System.out.println(pbook);
        System.out.println(" price = " + pbook.getPrice());
        EBook ebook = new EBook("author2", "Digitalised: Title", 100, 12);
        System.out.println(ebook);
        System.out.println(" price = " + ebook.getPrice());

        System.out.println();

        System.out.println(pbook.createReference("articlename", 10, 20));
        System.out.println(ebook.createReference("articlename", "2020/04/11"));
        System.out.println(ebook.createReference("articlename", 10, 20));
    }
}