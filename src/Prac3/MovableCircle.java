package Prac3;

public class MovableCircle implements Movable {
    private int Radius;
    private MovablePoint center;

    public MovableCircle (int rad, int x, int y, int xSpeed, int ySpeed) {
        this.Radius = rad;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);


    }



    @Override
    public String toString() {
        return "MovableCircle{" +
                "Radius=" + Radius +
                ", center=" + center +
                '}';
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
