package lab2;

public class Human {
    private Head head;
    private Leg rLeg, lLeg;
    private Hand rHand, lHand;

    public void move(){
        rLeg.moveLeg();
        lLeg.moveLeg();
        System.out.println("Шагаю");
    }

    public void take(){
        rHand.moveHand();
        lHand.moveHand();
        System.out.println("Беру в руки");
    }

}
