package prack12.task4;

public class Task4 {
    public static void main(String[] args) {
        for (String s : args) {
            if (checkNumValid(s))
                System.out.println(format(s));
        }
    }

    private static boolean checkNumValid(String s){
        char[] arr = s.toCharArray();
        boolean regP = arr[0] == '+' && arr.length - 11 >= 1 && arr.length <= 14;
        boolean notP = arr[0] == '8' && arr.length == 11;
        return regP || notP;
    }

    private static String format(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        if (s.charAt(0) == '8')
        {
            stringBuilder.append("+7 ");
            stringBuilder.append(s, 1, 4);
            stringBuilder.append('-');
            stringBuilder.append(s, 4, 7);
            stringBuilder.append('-');
            stringBuilder.append(s, 7, 11);
        } else {
            int endReg = s.length() - 10;
            stringBuilder.append('+');
            stringBuilder.append(s, 1, endReg);
            stringBuilder.append(' ');
            stringBuilder.append(s, endReg,  endReg+ 3);
            stringBuilder.append('-');
            stringBuilder.append(s, endReg + 3,  endReg + 6);
            stringBuilder.append('-');
            stringBuilder.append(s, endReg + 6,  s.length());
        }

        return stringBuilder.toString();
    }
}
