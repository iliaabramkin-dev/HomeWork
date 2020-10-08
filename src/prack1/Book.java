package prack1;

public class Book {
    // Состояние
    private int height;
    private int weight;
    private int count;
    private String name;

    // констурктор
    public Book(String name, int count) {
        this.count = count;
        this.name = name;
        this.height = 150;
        this.weight = 100;
    }

    // констурктор ( вызывается при создании обьекта)
    public Book( String name, int count, int height, int weight ) {
        this.height = height;
        this.weight = weight;
        this.count = count;
        this.name = name;
    }

    //геттеры и сетеры ( для установки и чтения значений и переменных состояния)
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // метот для превращения обьекта в текстоваое представление
    @Override
    public String toString() {
        return "Книга: " + name + ", кол-во страниц: " + count + ", размеры " + height + "х" + weight;
    }
}
