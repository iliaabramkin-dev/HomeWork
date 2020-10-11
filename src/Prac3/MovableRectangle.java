package Prac3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;


    public MovableRectangle (int x1, int y1, int xSpeed1, int ySpeed1, int x2, int y2, int xSpeed2, int ySpeed2) {
        this.topLeft        = new MovablePoint(x1, y1, xSpeed1, ySpeed1);
        this.bottomRight    = new MovablePoint(x2, y2, xSpeed2, ySpeed2);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public boolean checkSpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }
}
