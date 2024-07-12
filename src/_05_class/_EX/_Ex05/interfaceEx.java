package _05_class._EX._Ex05;

interface Music {
    void play(String Song);
    void stop(String Song);
}

class Mp3 implements Music {
    public void player() {
        System.out.println("=== Mp3 is playing ===");
    }
    @Override
    public void play(String Song) {
        System.out.println("Mp3 플레이어에서 " + "'" + Song + "'" + " 음악을 재생합니다.");
    }

    @Override
    public void stop(String Song) {
        System.out.println("Mp3 플레이어에서 " + "'" + Song + "'" + " 음악을 정지합니다.");
    }
}

class CDplayer implements Music {
    public void player() {
        System.out.println("=== CDplayer is playing ===");
    }

    @Override
    public void play(String Song) {
        System.out.println("CD player 플레이어에서 " + "'" + Song + "'" + " 음악을 재생합니다.");
    }

    @Override
    public void stop(String Song) {
        System.out.println("CD player 플레이어에서 " + "'" + Song + "'" + " 음악을 정지합니다.");
    }
}

public class interfaceEx {
    public static void main(String[] args) {
        Mp3 mp3 = new Mp3();
        mp3.player();
        mp3.play("거위의 꿈");
        mp3.stop("거위의 꿈");
        System.out.println("");
        CDplayer cdplayer = new CDplayer();
        cdplayer.player();
        cdplayer.play("무희");
        cdplayer.stop("무희");
    }
}
