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

    private Book(String author, String title, Genre genre, int reservePrice) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.reservePrice = reservePrice;
        id = lastId++;
    }

    public int getReservePrice() {
        return reservePrice;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public static Book make(String author, String title, String genreStr, String reservePriceStr) {
        try {
            int reservePrice = Integer.parseInt(reservePriceStr);
            if(author == null || title == null || title.length() < 2 || author.length() < 2 || reservePrice <= 0) {
                return null;
            }
            Genre genre = Genre.valueOf(genreStr);
            int i = 0;
            while(i < title.length()) {
                if(Character.isDigit(title.charAt(i)) || Character.isWhitespace(title.charAt(i)) 
                    || Character.isLetter(title.charAt(i))) {
                    ++i;
                }
                else return null;
            }
            i = 0;
            while(i < author.length()) {
                if(Character.isDigit(author.charAt(i)) || Character.isWhitespace(author.charAt(i)) 
                    || Character.isLetter(author.charAt(i))) {
                    ++i;
                }
                else return null;
            }
            return new Book(author, title, genre, reservePrice);
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
        // return Integer.compare(this.reservePrice, that.reservePrice);
        return (this.reservePrice < that.reservePrice) ? -1 : ((this.reservePrice == that.reservePrice) ? 0 : 1);
    }

}
