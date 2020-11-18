package prack12.task3;

public class Shirt {
    private String model;
    private String name;
    private String color;
    private String size;

    public Shirt(String info) {
        String[] arr = info.trim().split(",");
        model   = arr[0];
        name    = arr[1];
        color   = arr[2];
        size    = arr[3];
    }

    @Override
    public String toString() {
        return "Рубашка {\n" +
                "  Модель: " + model + '\n' +
                "  Название: " + name + '\n' +
                "  цвет: " + color + '\n' +
                "  размер: " + size + '\n' +
                '}';
    }
}
