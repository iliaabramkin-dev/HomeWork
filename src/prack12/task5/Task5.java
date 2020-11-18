package prack12.task5;

import lab8.FileCRUD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        FileCRUD fileCRUD = new FileCRUD("resources/test.txt");
        String s = fileCRUD.read();
        System.out.println(s);
        System.out.println(getLine(s));

    }

    private static String getLine(String string) {
        String[] arr = string.split(" ");

        boolean b;
        do {
            b = false;
            for (int i = 0; i < arr.length; i++) {
                char last = arr[i].toUpperCase().charAt(arr[i].length() - 1);
                for (int j = i + 1; j < arr.length; j++) {
                    char first = arr[j].toUpperCase().charAt(0);
                    if (first == last) {
                        if (j == i + 1) break;
                        String a = arr[i + 1];
                        arr[i + 1] = arr[j];
                        arr[j] = a;
                        b = true;
                        break;
                    }
                }
            }
        }while (b);

        StringBuilder builder = new StringBuilder();
        for (String s:
                arr) {
            builder.append(s).append(" ");
        }
        return builder.toString();
    }
}
