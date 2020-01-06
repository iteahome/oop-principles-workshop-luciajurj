package library.model;

import java.util.Date;

public class BooksDetails<BookStatus> {
    private Date borrowed;
    private Date dueDate;
    private BookStatus status;

    public BooksDetails(Date borrowed, Date dueDate, BookStatus status) {
        super();
        this.borrowed = borrowed;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Date getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Date borrowed) {
        this.borrowed = borrowed;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
