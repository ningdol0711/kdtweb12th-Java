package _05_class._EX._Ex04;

public abstract class Shape {
    String color;
    String type;

    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    abstract double getArea();
}
