public class Book {
    static enum Genre {
        FANTASY, SATIRE, SCIFI, PHILOSOPHY, EDUCATIONAL;
    }

    private final String author;
    private final String title;
    private final int reservePrice;
    private final int id;
    private final Genre genre;

    private static int lastId;

    private Book(String author, String title, int reservePrice, Genre genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.reservePrice = reservePrice;
        id = lastId++;
    }

    public String getAuthor() {
        return author;
    }
    public int getId() {
        return id;
    }

    public static Book make(String author, String title, String reservePriceString, String genre) {
        try {
            int reservePrice = Integer.parseInt(reservePriceString);
            if(author == null || title == null || title.length() < 2 || reservePrice <= 0) {
                return null;
            }
            Genre g = Genre.valueOf(genre);
            int i = 0;
            while(i < title.length()) {
                if(Character.isLetter(title.charAt(i)) || Character.isDigit(title.charAt(i))
                    || Character.isWhitespace(title.charAt(i))) {
                    i++;
                }
                else return null;
            }
            return new Book(author, title, reservePrice, g);
        } catch(IllegalArgumentException ex) {
            return null;
        }
    }

    public static boolean isSameGenre(Book b1, Book b2) {
        return b1.genre == b2.genre;
    }

    public int compare(Book that) {
        if(!isSameGenre(this, that)) {
            throw new IllegalArgumentException();
        }
        // return Integer.compare(this.reservePrice, that.reservePrice);
        return (this.reservePrice < that.reservePrice) ? -1 : ((this.reservePrice == that.reservePrice) ? 0 : 1);
    }
}
