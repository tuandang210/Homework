package Books;

public class ProgrammingBook extends Book {
    private String language;
    private String flamework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, String flamework) {
        this.language = language;
        this.flamework = flamework;
    }

    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String flamework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.flamework = flamework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFlamework() {
        return flamework;
    }

    public void setFlamework(String flamework) {
        this.flamework = flamework;
    }
}
