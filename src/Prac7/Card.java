package Prac7;

public class Card implements Comparable<Card> {
    private int value;

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public int compareTo(final Card o) {
        return this.value - o.value;
    }
}
