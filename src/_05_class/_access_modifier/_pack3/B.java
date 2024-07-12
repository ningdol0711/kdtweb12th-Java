package _05_class._access_modifier._pack3;

public class B {
    public void method() {
        A a = new A(); // _pack3.A 와 _pack3.B 는 서로 같은 패키지

        // 필드 변경
        a.field1 = 11;
        a.field2 = 22;
        // a.field3 = 33; // private field 이므로 compile error

        // 메서드 호출
        a.method1();
        a.method2();
        // a.method3(); // private method 이므로 compile error
    }
}
