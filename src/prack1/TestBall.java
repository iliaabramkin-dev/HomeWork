package prack1;

public class TestBall {

    public static void main(String[] args) {
        Ball b1 = new Ball();
        b1.setColor("КРАСНЫЙ");

        Ball b2 = new Ball(50, "Желтый", "Баскетбольный");

        Ball b3 = new Ball(10, "Хелень");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
