package library.model;

public abstract class Book extends Author {
    private String title;
    private String subject;
    private String language;

    public Book(String title, String subject, String language) {
        super("Mihai Eminescu");
        this.title = title;
        this.subject = subject;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
