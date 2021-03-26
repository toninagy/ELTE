public class Book {
    enum Genre {
        FANTASY, SATIRE, SCIFI, PHILOSOPHY, EDUCATIONAL
    }

    private final String author;
    private final String title;
    private final int reservePrice;
    private final int id;
    private final Genre genre;

    private static int lastID;
    public static void resetID() {
        lastID = 0;
    }

    public int getID() {
        return id;
    }

    private Book(String author, String title, Genre genre, int reservePrice) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.reservePrice = reservePrice;
        this.id = ++lastID;
    }

    public static Book make(String author, String title, String genreName, String reservePriceString) {
        try {
            Genre genre = Genre.valueOf(genreName);
            int reservePrice = Integer.parseInt(reservePriceString);

            if(author == null || title == null || title.length() < 2 || reservePrice <= 0) {
                return null;
            }

            int i = 0;
            while(i < title.length()) {
                if(Character.isLetter(title.charAt(i)) || Character.isDigit(title.charAt(i))
                    || Character.isWhitespace(title.charAt(i))) {
                        ++i;
                    }
                else {
                    return null;
                }
            }
            return new Book(author, title, genre, reservePrice);
        } catch(NumberFormatException ex) {
            return null;
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
        // return this.reservePrice < that.reservePrice ? -1 : (this.reservePrice == that.reservePrice ? 0 : 1);
        return Integer.compare(this.reservePrice, that.reservePrice);
    } 

}
