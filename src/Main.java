import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Филип", "Дик");
        Author author2 = new Author("Александр", "Сергеевич");

        Book book1 = new Book("Мечтают ли андроиды об электроовцах?", author1, 1968);
        Book book2 = new Book("Евгений Онегин", author2, 1827);


        System.out.println("Книга 1: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год публикации: " + book1.getPublicationYear());
        System.out.println("Книга 2: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год публикации: " + book2.getPublicationYear());

        book2.setPublicationYear(1833);
        System.out.println("Обновленный год публикации книги 2: " + book2.getPublicationYear());

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        System.out.println("Книги одинаковые? " + book1.equals(book2));

        book2.setPublicationYear(1837);
        System.out.println("Обновленный год публикации книги 2:  " + book2.toString());

        System.out.println("Хэш-код книги 1: " + book1.hashCode());
        System.out.println("Хэш-код книги 2: " + book2.hashCode());
    }
}