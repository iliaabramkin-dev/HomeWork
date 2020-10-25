package lab5.Task1.shap;

import java.awt.*;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
    }


    @Override
    public void draw(Graphics2D g, int x, int y) {
        g.setColor(color);
        g.fillOval(x, y, (int) radius, (int)radius);
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle( double radius, Color color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * getRadius() * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}
