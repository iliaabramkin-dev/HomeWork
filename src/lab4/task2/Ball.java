package lab4.task2;

public class Ball implements Priceable {
    private String name;

    public Ball(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return 1234;
    }
}
