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

    public static void resetId() {
        lastId = 0;
    }

    public int getReservePrice() {
        return reservePrice;
    }

    public int getId() { return id; }

    private Book(String author, String title, Genre genre, int reservePrice) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.reservePrice = reservePrice;
        id = lastId++;
    }

    public static Book make(String author, String title, String genreName, String reservePriceStr) {
        try {
            int reservePrice = Integer.parseInt(reservePriceStr);

            if(author == null || title == null || reservePrice <= 0 || title.length() < 2) {
                return null;
            }

            Genre g = Genre.valueOf(genreName);
            int i = 0;
            while(i < title.length()) {
                if(Character.isDigit(title.charAt(i)) || Character.isLetter(title.charAt(i)) || Character.isWhitespace(title.charAt(i))) {
                    ++i;
                }
                else return null;
            }
            return new Book(author, title, g, reservePrice);
        } catch(NumberFormatException nfe) {
            return null;
        } catch(IllegalArgumentException iae) {
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
        //return (this.reservePrice < that.reservePrice) ? -1 : (this.reservePrice == that.reservePrice ? 0 : 1); 
        return Integer.compare(this.reservePrice,that.reservePrice);
    }
}