package prac6;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].id = random.nextInt(5);
            System.out.print(students[i].id + " ");
        }

        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].id > key.id) {
                students[j + 1]= students[j];
                j = j - 1;
            }
            students[j + 1]= key;
        }
        System.out.println();
        for (Student student : students) {
            System.out.print(student.id + " ");
        }
    }
}
