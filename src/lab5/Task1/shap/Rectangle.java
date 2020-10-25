package lab5.Task1.shap;

import java.awt.*;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    @Override
    public void draw(Graphics2D g, int x, int y) {
        g.setColor(color);
        g.drawRect(x, y, (int) width, (int) length);
    }


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle( double width, double length, Color color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return  (width * length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
