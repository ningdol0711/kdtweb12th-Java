package _05_class._Interface._interface_02;

interface Controller {
    void powerOff();
    void powerOn();

    default void display() {System.out.println("디스플레이가 켜졌습니다.");}
}

class TV implements Controller {
    @Override
    public void powerOn() {
        System.out.println("TV power On");
    }

    @Override
    public void powerOff() {
        System.out.println("TV power Off");
    }
}

class Computer implements Controller {
    @Override
    public void powerOn() {
        System.out.println("Computer power On");
    }

    @Override
    public void powerOff() {
        System.out.println("Computer power Off");
    }
}

public class interfaceEx {
    public static void main(String[] args) {
        TV tv = new TV();
        Computer computer = new Computer();

        tv.powerOn();
        tv.display();
        tv.powerOff();

        computer.powerOn();
        computer.display();
        computer.powerOff();
    }
}
