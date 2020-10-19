package lab3.task1;

public class Cup extends Dish {

    public Cup(String type) {
        super(type);
    }

    @Override
    void fill() {
        System.out.println("Наполняю кружку");
    }

    @Override
    void clear() {
        System.out.println("Чищу кружку");
    }

    @Override
    public String toString() {
        return "Cup{" + super.toString();
    }
}
