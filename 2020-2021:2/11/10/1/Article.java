import java.io.File;
import java.io.PrintWriter;

import java.io.IOException;
import java.util.ArrayList;

public class Article {
    private String title;
    private String body;
    private String conclusion;
    private ArrayList<Book> refs;

    public Article(String title, String body, String conclusion) {
        this.title = title;
        this.body = body;
        this.conclusion = conclusion;
        this.refs = new ArrayList<>();
    }

    public void addBookToReferences(Book book) {
        refs.add(book);
    }

    private void printReference(Book book, int from, int to, PrintWriter pw) {
        String reference = book.createReference(this.title, from, to);
        pw.print(reference);
        pw.print(System.lineSeparator());
    }

    public void print(String fileName) {
        try(PrintWriter pw = new PrintWriter(new File(fileName))) {
            pw.print(title);
            pw.print(System.lineSeparator());
            pw.print(body);
            pw.print(System.lineSeparator());
            pw.print(conclusion);
            pw.print(System.lineSeparator());

            for(Book book : refs) {
                printReference(book, 1, book.getPages(), pw);
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
