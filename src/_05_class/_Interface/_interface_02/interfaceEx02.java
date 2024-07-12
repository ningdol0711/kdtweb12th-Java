package _05_class._Interface._interface_02;

interface Move {
    void moveForward();
    void moveBackward();
}

interface Power {
    void powerOn();
    void powerOff();
}

// extends : 인터페이스가 인터페이스를 상속 받을때
// implements : 클래스가 인터페이스를 상속 받을때
interface Car extends Move, Power {
    void changeGear(int gear);
}

class SUV implements Car {

    @Override
    public void changeGear(int gear) {
        System.out.println("SUV changeGear to " + gear);
    }

    @Override
    public void moveForward() {
        System.out.println("SUV moveForward");
    }

    @Override
    public void moveBackward() {
        System.out.println("SUV moveBackward");
    }

    @Override
    public void powerOn() {
        System.out.println("SUV powerOn");
    }

    @Override
    public void powerOff() {
        System.out.println("SUV powerOff");
    }
}

public class interfaceEx02 {
    public static void main(String[] args) {
        SUV suv = new SUV();
        suv.powerOn();
        suv.changeGear(2);
        suv.moveForward();
    }
}
