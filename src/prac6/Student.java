package prac6;


public class Student implements Comparable<Student> {
    int id;
    int ball;

    @Override
    public int compareTo(Student o) {
        return o.ball - this.ball;
    }
}
