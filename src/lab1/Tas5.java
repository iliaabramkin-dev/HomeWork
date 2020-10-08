package lab1;

public class Tas5 {
    public static void main(String[] args) {

        System.out.println(fact(4));
    }

    private static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
