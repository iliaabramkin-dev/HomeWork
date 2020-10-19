package lab3.task3;

public class Table extends Mebel {
    private int height;
    public Table(int price, String name, int height, String company, String material) {
        super(name, price, company, material, "Стол");
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Table{" +
                super.toString() +
                ".height=" + height +
                '}';
    }
}
