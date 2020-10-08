package lab2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1,2,3);
        System.out.println(circle.getX());
        circle.setX(34);
        System.out.println(circle.getX());
        System.out.println(circle);
    }
}
