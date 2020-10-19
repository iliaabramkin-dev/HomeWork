package lab3.task3;

public class Divan extends Mebel {
    public Divan(int price, String name, String company, String material) {
        super(name, price, company, material, "Диван");
    }

    @Override
    public String toString() {
        return "Divan{" + super.toString() +"}";
    }
}
