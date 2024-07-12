package _05_class._Interface._interface_01;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio is off");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.max_Vol) {
            this.volume = RemoteControl.max_Vol;
        } else if (volume < RemoteControl.min_Vol) {
            this.volume = RemoteControl.min_Vol;
        } else {
            this.volume = volume;
        }
        System.out.println("Volume set to " + volume);
    }
}
