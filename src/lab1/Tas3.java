package lab1;

public class Tas3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println(getNum(i));
        }
    }

    private static double getNum(int n){
        double sum = 0;
        for (double i = 1; i <= n; i++){
            sum += 1 / i;
        }
        return sum;
    }
}
