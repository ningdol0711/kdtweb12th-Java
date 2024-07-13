package _05_class._EX._Ex06;

public abstract class Vehicle {
    String name;
    String maxSpeed;

    void getter() {
        System.out.println("getter");
    }
    void setter() {
        System.out.println("setter");
    }

    abstract void move();
}
