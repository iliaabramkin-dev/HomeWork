package Prac2;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint centre;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        centre = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
