package Prac3;

public class Square extends Rectangle {
    protected double Side;
    public Square() {
    }

    public Square(double side) {
        Side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        Side = side;
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double side) {
        Side = side;
    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public String toString() {
        return "Square{" +
                "Side=" + Side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
