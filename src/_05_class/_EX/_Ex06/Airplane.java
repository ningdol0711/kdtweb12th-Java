package _05_class._EX._Ex06;

public class Airplane extends Vehicle implements flyable {
    @Override
    public void fly() {
        System.out.println("고도 10000피트에서 비행 중");
    }

    @Override
    void move() {
        System.out.println("하늘을 날아가는 중");
    }
}
