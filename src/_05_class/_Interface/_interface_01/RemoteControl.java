package _05_class._Interface._interface_01;

public interface RemoteControl {
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    int max_Vol = 10;
    int min_Vol = 0;
}

// 아래 3개의 선언은 모두 동일한 선언
// i) public static final int Y = 1;
// ii) static final int Y = 1;
// iii) final int Y = 1;
