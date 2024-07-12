package _05_class._Interface._interface_01;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;

//        rc 변수에 Television 객체 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(7);
        rc.turnOff();

//        rc 변수에 Audio 객체 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(13);
        rc.turnOff();
    }
}
