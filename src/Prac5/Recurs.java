package Prac5;

public class Recurs {
    public static void main(String[] args) {
        Recurs r = new Recurs();
        r.rec1(10);
        System.out.println("______________________");
        r.rec2(15, 10);
        System.out.println("______________________");
        System.out.println(r.rec5(1234));
        int[] arr = {3, 3, 3, 4, 4, 4, 4, 5,5,5,5,5,6,6,6,6,6,6};
        System.out.println("______________________");
        r.rec4(arr, 3);
    }

    public void rec4 (final int[] arr, int n) {
        rec4(arr, arr.length, 0, 0, n);
    }

    public void rec4 (final int[] arr, final int l, int i, int a, int n) {
        if (n == 0) return;
        if (a != arr[i]){
            System.out.println(arr[i]);
            a = arr[i];
            n--;
        }
        rec4(arr, l, ++i, a, n);
    }

    public void rec1(final int n){
        rec1(n, 1);
    }

    private void rec1(final int n, int i){
        if( i > n) return;
        System.out.println(i);
        rec1(n, ++i);
    }


    public void rec2(final int a, final int b){
        rec2(a, b, a);
    }
    private void rec2(final int a, final int b, int c) {
        if (a < b) {
            if ( c > b) return;
            System.out.println(c++);
        } else {
            if ( c < b) return;
            System.out.println(c--);
        }
        rec2(a, b, c);
    }

    public int rec5(final int a) {
        return rec5(0, a);
    }

    public int rec5(int sum, int a) {
        if (a == 0) return 0;
        int i = a%10;
        return rec5(sum + i, a / 10) + i;
    }
}
