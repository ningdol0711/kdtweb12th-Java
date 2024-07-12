package _05_class._access_modifier._pack5;

// 단 하나의 객체, Singleton!
// - 애플리케이션에서 단 하나의 객체를 만들고 싶다면, 싱글톤 패턴 사용!
// - 핵심 개념: private 접근 제어자 이용해서 외부에서 new 연산자로 생성자를 호출할 수 없도록 막음
// - 생성자를 호출할 수 없으므로 외부에서 객체 생성이 불가능해짐
// - 싱글톤 패턴이 제공하는 정적 메소드를 통해 간접적으로 객체를 얻을 수 있음
public class Singleton {
    // private 접근 권한을 갖는 정적 필드 선언과 초기화
    private static Singleton singleton = new Singleton();

    // private 접근 권한을 갖는 생성자 선언
    private Singleton() {}

    // public 접근 권한을 갖는 정적 메소드 선언
    public static Singleton getSingleton() { return singleton; }
}
