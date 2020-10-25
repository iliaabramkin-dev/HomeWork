package lab5.Task1.shap;

import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract void draw(Graphics2D g, int x, int y);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
