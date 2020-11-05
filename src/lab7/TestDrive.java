package lab7;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestDrive {
    public static void main(String[] args) {
        MyList integers = new MyList();
        integers.add(345);
        integers.add(45);
        integers.add(34);

        System.out.println(integers);

        integers.addFirst(999);

        System.out.println(integers);
    }

    private static void testArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(43);
        list.add(94);
        list.add(41);
        System.out.println(list);
        System.out.println(list.remove(1));
        list.remove(1);
        list.add(0, 100);
        System.out.println(list);
    }

    private static void testLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.addFirst(2);
        list.add(94);
        list.add(41);
        list.addLast(43);
        System.out.println(list);
        list.remove(new Integer(43));
        list.remove(1);
        list.add(0, 2);
        Integer i = list.poll();
        list.push(67);
        System.out.println(list);
    }
}
