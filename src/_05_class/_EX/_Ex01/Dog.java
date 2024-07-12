package _05_class._EX._Ex01;

public class Dog extends Animal {
    public Dog (String name, int age) {
        this.Species = "강아지";
    } 
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}
