package _05_class._Interface._interface_02;

// 전화 기능을 위한 인터페이스
interface Phone {
    void makeCall(String number);
    void answerCall();
}

// 인터넷 기능을 위한 인터페이스
interface InternetDevice {
    void browseWeb(String url);
    void sendEmail(String address, String content);
}

// 카메라 기능을 위한 인터페이스
interface Camera {
    void takePhoto();
    void recordVideo();
}

// 다중 인터페이스 구현 개체
class smartphone implements Phone, InternetDevice, Camera {

    @Override
    public void takePhoto() {
        System.out.println("takePhoto");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("웹서핑 " + url);
    }

    @Override
    public void sendEmail(String address, String content) {
        System.out.println("이메일을 보냅니다." + address + "\n" + content);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("전화를 겁니다." + number);
    }

    @Override
    public void answerCall() {
        System.out.println("전화를 받습니다.");
    }
}

public class interfaceEx04 {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        
        sp.answerCall();
        sp.browseWeb("https://www.google.com");
        sp.makeCall("010-8393-3730");
        sp.recordVideo();
        sp.sendEmail("wnsrb2697@gmail.com", "이것은 이메일");
    }
}