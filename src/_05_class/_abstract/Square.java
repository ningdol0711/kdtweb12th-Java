package _05_class._abstract;

public class Square extends Shape {
    public Square(String color) {
        super(color);
    }
    
    @Override
    public void draw() {
        System.out.println("사 투더 각 투더 형");
    }
}
