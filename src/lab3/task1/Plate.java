package lab3.task1;

public class Plate extends Dish {
    private int rad;
    public Plate(String type, int rad) {
        super(type);
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    @Override
    void fill() {
        System.out.println("Кладу в тарелку");
    }

    @Override
    void clear() {
        System.out.println("Мою тарелку");
    }

    @Override
    public String toString() {
        return "Plate{ rad=" + rad + super.toString();
    }
}
