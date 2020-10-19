package lab4.task1;

public class People implements Nameable {
    private String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
