package _07_generic;

class Box<T extends Number> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}

interface Movable {
    void move();
}

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Moving Car");
    }
}

class Bicycle implements Movable {
    @Override
    public void move() {
        System.out.println("Moving Bicycle");
    }
}

class Container<T extends Movable> {
    private T items;
    public Container(T items) {
        this.items = items;
    }
    public void makeItMove() {
        items.move();
    }
}

public class GenericEx02 {
    public static void main(String[] args) {
        Box<Double> dBox = new Box<>();
        dBox.setItem(3.1415926548);
        System.out.println(dBox.getItem());

        Box<Integer> iBox = new Box<>();
        iBox.setItem(314);
        System.out.println(iBox.getItem());

        Box<Short> sBox = new Box<>();
        sBox.setItem((short)31415);
        System.out.println(sBox.getItem());

        Container<Car> cc = new Container<>(new Car());
        Container<Bicycle> cb = new Container<>(new Bicycle());

        cc.makeItMove();
        cb.makeItMove();
    }
}
