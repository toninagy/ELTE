public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        PrintedBook pbook1 = new PrintedBook();
        EBook ebook1 = new EBook("author2", "Digitalised: Title", 100, 12);

        System.out.println(book1);
        System.out.println(pbook1);
        System.out.println(ebook1);

        System.out.println();

        System.out.println(book1.createReference("articlename1", 10, 20));
        System.out.println(pbook1.createReference("articlename2", 10, 20));
        System.out.println(ebook1.createReference("articlename3", 10, 20));

        Article myArticle = new Article("My fictional article", "foo_body", "foo_conclusion");
        myArticle.addBookToReferences(book1); // LSP
        myArticle.addBookToReferences(pbook1); // LSP
        myArticle.addBookToReferences(ebook1); // LSP
        myArticle.print("out.txt");
    }
}
