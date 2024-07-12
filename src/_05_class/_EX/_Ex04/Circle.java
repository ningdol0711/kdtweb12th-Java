package _05_class._EX._Ex04;

public class Circle extends Shape {
    public Circle(String color, String type) {
        super(color, type);
        this.radius = radius;
    }
    public double radius;

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}