package _05_class._abstract;

public class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("동 투더 그 투더 라미");
    }
}
