package md.tekwill.bookcollectiontask;

public class Book {
    private String title;
    private String author;

    public Book(String tile, String author) {
        this.title = tile;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

