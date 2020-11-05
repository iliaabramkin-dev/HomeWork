package Prac7;

import java.util.Deque;
import java.util.LinkedList;

public class Player {
    private final String name;
     final Deque<Card> cards;

    public Player(String name) {
        this.name = name;
        cards = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public Card getCard() {
        return cards.pop();
    }

    public void putCard(Card c) {
        cards.addLast(c);
    }
    public void putCards(Card c1, Card c2) {
        cards.addLast(c1);
        cards.addLast(c2);
    }

    @Override
    public String toString() {
        return name;
    }
}
