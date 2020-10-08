package prack1;

public class Ball {
    private int radius;
    private String color;
    private String type;

    public Ball() {
        this.radius = 1;
        this.color  = "Белый";
        this.type   = "Футбольный";
    }

    public Ball(int radius) {
        this.radius = radius;
        this.color  = "Белый";
        this.type   = "Футбольный";
    }

    public Ball(int radius, String color) {
        this.radius = radius;
        this.color = color;
        this.type   = "Футбольный";
    }

    public Ball(int radius, String color, String type) {
        this.radius = radius;
        this.color = color;
        this.type = type;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "radius=" + radius + ", color=" + color + ", type=" + type;
    }
}
