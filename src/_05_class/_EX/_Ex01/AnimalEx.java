package _05_class._EX._Ex01;

public class AnimalEx {
    public static void main(String[] args) {
        Cat Cat = new Cat("멍멍이", 1);
        Dog Dog = new Dog("야옹이", 2);

        Cat.makeSound();
        Dog.makeSound();
    }
}