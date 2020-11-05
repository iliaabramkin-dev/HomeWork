package Prac7;

public class TestGame {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Не коректные данные");
            return;
        }
        new GameControl(args[0], args[1]);
    }
}
