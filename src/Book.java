public class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return title + " автор " + author.toString() + ", год публикации " + publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return publicationYear == book.publicationYear &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, publicationYear);
    }
}

