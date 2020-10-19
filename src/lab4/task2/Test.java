package lab4.task2;

public class Test {
    public static void main(String[] args) {
        Priceable priceable = new Ball("Adidas");
        Tall tall = new Tall();
        System.out.println(priceable.getPrice());
        System.out.println(tall.getPrice());
    }
}
