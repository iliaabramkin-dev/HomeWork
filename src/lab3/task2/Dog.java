package lab3.task2;

public abstract class Dog {
    private int height;
    private int weight;
    private int name;

    public Dog(int height, int weight, int name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    abstract void run();
    abstract void eat();
    abstract void sleep();
}
