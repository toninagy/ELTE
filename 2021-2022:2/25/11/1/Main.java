public class Main {
    public static void main(String[] args) {
        PrintedBook pbook1 = new PrintedBook();
        EBook ebook1 = new EBook("axc", "abxd", 504, 20);

        System.out.println(pbook1.getShortName());
        System.out.println(ebook1.getShortName());
        System.out.println(pbook1.getPrice());
        System.out.println(ebook1.getPrice());
        // b2.createReference("afd", "2021-04-09");
        ebook1.createReference("afd", "2021-04-09");
    }
}
