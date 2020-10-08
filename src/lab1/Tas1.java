package lab1;

public class Tas1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int i;
        int sum = 0;
        for (i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);

        sum = 0;
        i = 0;
        while (i < arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
    }
}
