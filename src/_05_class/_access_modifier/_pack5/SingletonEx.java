package _05_class._access_modifier._pack5;

public class SingletonEx {

    public static void main(String[] args) {
//        Singleton s1 = new Singleton();
        // Singleton 클래스의 생성자가 private 이므로 compile error

        Singleton s2 = Singleton.getSingleton();
        Singleton s3 = Singleton.getSingleton();

        // s2와 s3가 같은 객체를 참조하는가?
        if (s2 == s3) {
            System.out.println("같은 객체입니다.");
            System.out.println(s2);
            System.out.println(s3);
        } else {
            System.out.println("다른 객체입니다.");
        }
    }

}
