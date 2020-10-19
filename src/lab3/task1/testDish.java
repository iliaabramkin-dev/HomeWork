package lab3.task1;

public class testDish {
    public static void main(String[] args) {
        Dish dish = new Cup("Кружка");
        Plate plate = new Plate("Тарелка", 12);
        System.out.println(dish);
        plate.clear();
    }
}
