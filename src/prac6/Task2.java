package prac6;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].ball = random.nextInt(5);
            System.out.print(students[i].ball + " ");
        }

        quicksort(students);
        System.out.println();
        for (Student student : students) {
            System.out.print(student.ball + " ");
        }
    }
    public static void quicksort(final Student[] students) {
        quicksort(students, 0 , students.length - 1);
    }
    private static void quicksort(final Student[] students, int low, int high) {
        if (low < high) {
            Student pivot = students[low];
            int i = low;
            for (int j = low + 1; j <= high; j++) {
                if (students[j].compareTo(pivot) > 0) {
                    ++i;
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }

            Student temp = students[low];
            students[low] = students[i];
            students[i] = temp;

            quicksort(students, low, i - 1);
            quicksort(students, i + 1, high);
        }
    }


}
