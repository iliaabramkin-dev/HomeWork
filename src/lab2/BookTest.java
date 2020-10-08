package lab2;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("А.С Пушкин", "Капитанская Дочка", 1799, 345, 567);
        System.out.println(book);
        System.out.println(book.getPrice());
        book.setPrice(2000);
        System.out.println(book.getPrice());

        System.out.println(book.getAuthor());
    }
}
