package lab3.task1;

public abstract class Dish {
    private String type;

    public Dish(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    abstract void fill();
    abstract void clear();

    @Override
    public String toString() {
        return "type='" + type + '\'' +
                '}';
    }
}
