package _05_class._EX._Ex04;

public class ShapeEx {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", "Circle");
        ShapeInfo(circle);
    }

    public static void ShapeInfo(Shape shape) {
        System.out.println("Shape: " + shape);
    }
}
