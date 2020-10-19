package lab3.task3;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        List<Mebel> mebels = new ArrayList<>();
        mebels.add(new Divan(1000, "павра", "мсчмя ", "авыпыв"));
        mebels.add(new Divan(3000, "павра1", "мсчмя ", "авыпыв"));
        mebels.add(new Divan(5000, "павра2", "мсчмя2 ", "авыпыв"));
        mebels.add(new Divan(2000, "павра5", "мсчмя ", "авыпыв"));
        mebels.add(new Table(2000, "ра5", 15, "мсчмя ", "авыпыв"));
        mebels.add(new Table(5000, "р5", 15, "мсчмя ", "авыпыв"));
        mebels.add(new Table(1000, "па5", 15, "мсчмя ", "авыпыв"));
        mebels.add(new Table(26000, "вра1", 15, "мсчмя ", "авыпыв"));

        System.out.println("Каталог:");
        for (int i = 0; i < mebels.size(); i++) {
            System.out.println(mebels.get(i));
        }
    }
}
