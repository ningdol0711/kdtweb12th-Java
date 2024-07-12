package _05_class._abstract;

public class ShapeEx {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue");
        Square square = new Square("Red");

        go(circle);
        go(square);
    }
    public static void go(Shape shape) {
        shape.start();
        shape.draw();
        System.out.println("도형 색상 : " + shape.getColor());
    }
}
