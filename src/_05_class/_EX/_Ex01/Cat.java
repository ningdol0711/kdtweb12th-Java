package _05_class._EX._Ex01;

public class Cat extends Animal{
    public Cat (String name, int age) {
        this.Species = "고양이";
    }
    @Override
    void makeSound() {
        System.out.println("야옹");
    }
}
