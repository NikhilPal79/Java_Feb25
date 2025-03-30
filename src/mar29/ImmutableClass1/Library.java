package mar29.ImmutableClass1;

import java.util.Objects;

public final class Library {

    private final int id;
    private final String bookName;
    private final int dateOfIssue;

    public Library(int id, String bookName, int dateOfIssue) {
        this.id = id;
        this.bookName = bookName;
        this.dateOfIssue = dateOfIssue;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", dateOfIssue=" + dateOfIssue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return id == library.id && dateOfIssue == library.dateOfIssue && Objects.equals(bookName, library.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, dateOfIssue);
    }



}

