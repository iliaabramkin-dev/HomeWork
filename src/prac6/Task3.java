package prac6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Student[] students1 = new Student[5];
        Student[] students2 = new Student[5];
        Random random = new Random();
        for (int i = 0; i < students1.length; i++) {
            students1[i] = new Student();
            students1[i].ball = random.nextInt(5);

            students2[i] = new Student();
            students2[i].ball = random.nextInt(5);
        }

        System.out.println(1);
        for (Student student : students1) {
            System.out.print(student.ball + " ");
        }
        System.out.println("\n2");
        for (Student student : students2) {
            System.out.print(student.ball + " ");
        }

        SortUnsorted(students1);
        SortUnsorted(students2);

        Student[] students3 = new Student[students1.length + students2.length];
        int a = 0, b = students1.length;
        for (int i = 0; i < students3.length / 2; i++){
            students3[i] = students1[a];
            students3[b++] = students2[a];
            a++;
        }

        System.out.println("\n3");
        for (Student student : students3) {
            System.out.print(student.ball + " ");
        }

        SortUnsorted(students3);

        System.out.println("\n4");
        for (Student student : students3) {
            System.out.print(student.ball + " ");
        }
    }

    public static void SortUnsorted(final Student[] students) {
        SortUnsorted(students, 0 , students.length - 1);
    }

    private static void SortUnsorted(Student[] students, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(students, lo, mid);
        SortUnsorted(students, mid + 1, hi);

        Student[] buf = copyOf(students, students.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = students[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                students[k] = buf[j];
                j++;
            } else if (j > hi) {
                students[k] = buf[i];
                i++;
            } else if (buf[j].ball < buf[i].ball) {
                students[k] = buf[j];
                j++;
            } else {
                students[k] = buf[i];
                i++;
            }
        }
    }

    private static Student[] copyOf (Student[] arr, int c){
        Student[] students = new Student[c];
        for (int i = 0; i< arr.length; i++){
            students[i] = arr[i];
        }
        return students;
    }
}
