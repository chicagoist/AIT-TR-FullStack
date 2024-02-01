package lesson_35.classwork;

public class Author implements Comparable<Author> {

    private String authorName;
    private String bookName;
    private int year;

    public Author(String authorName, String bookName, int year) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.year = year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + getAuthorName() + '\'' +
                ", bookName='" + getBookName() + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Author o) {
        return this.getAuthorName().compareTo(o.getAuthorName());
    }
}
