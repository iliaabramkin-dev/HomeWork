package Prac7;

public class GameControl {
    private Player p1;
    private Player p2;

    private int min = 9, max = 0;
    public GameControl(String card1, String card2) {
        p1 = new Player("P1");
        p2 = new Player("P2");
        giveCardsForPlayer(card1, p1);
        giveCardsForPlayer(card2, p2);
        startGame();
    }
    
    private void giveCardsForPlayer (String cards, Player player) {
        String[] arr = cards.split(",");

        for (String a : arr) {
            int v = Integer.parseInt(a);
            if (v < min) min = v;
            if (v > max) max = v;
            player.putCard(new Card(v));
        }
    }

    public void startGame() {
        boolean findWinner;
        int stepCount = 1;
        final String getCard = "%s достал карту (%d)\n";
        do {
            System.out.println();
            Card card1 = p1.getCard();
            Card card2 = p2.getCard();

            System.out.printf(getCard, p1, card1.getValue());
            System.out.printf(getCard, p2, card2.getValue());

            Player lose;
            if (card1.getValue() == min && card2.getValue() == max)
                lose = p2;
            else if (card2.getValue() == min && card1.getValue() == max)
                lose = p1;
            else lose = card1.compareTo(card2) > 0 ? p2 : p1;

            lose.putCards(card2, card1);
            System.out.println(lose + " забирает карты себе в колоду");

            findWinner = p1.cards.size() != 0 &&
                    p2.cards.size() != 0;
        } while (findWinner && ++stepCount != 106);

        String res;
        if (stepCount == 106){
            res = "botva";
        } else {
            res = p1.cards.size() == 0 ? "first" : "second";
            res += " " + stepCount;
        }

        System.out.println(res);

    }
}
