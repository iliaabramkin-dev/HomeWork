package prack1;

public class TestBook {

    public static void main(String[] args) {
        Book b1 = new Book("FPPF", 100);
        b1.setName("Капитанская дочь");

        Book b2 = new Book("Война и мир", 645, 200, 400);


        System.out.println(b1);
        System.out.println(b2);
    }
}
