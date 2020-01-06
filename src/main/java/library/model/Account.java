package library.model;

import java.util.List;

public class Account extends Admin implements Search {
    private String type;

    public Account(String username, String password, String email) {
        super(username, password, email);
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> searchBySubject(String subject) {
        return null;
    }
}

