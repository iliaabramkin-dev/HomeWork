package lab2;

public class Book {
    private int year, pageCount, price;
    private String author, bookName;

    public Book(String author, String bookName, int year, int pageCount, int price) {
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.author = author;
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", pageCount=" + pageCount +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
