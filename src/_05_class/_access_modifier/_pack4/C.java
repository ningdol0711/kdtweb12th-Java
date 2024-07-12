package _05_class._access_modifier._pack4;

import _05_class._access_modifier._pack3.A;

public class C {
    public void method() {
        A a = new A(); // _pack3.A 와 _pack4.C 는 서로 다른 패키지 -> import 문

        // 필드 변경
        a.field1 = 111;
//        a.field2 = 222; // default field 이므로 compile error
//        a.field3 = 333; // private field 이므로 compile error

        // 메서드 호출
        a.method1();
//        a.method2(); // default method 이므로 compile error
//        a.method3(); // private method 이므로 compile error

    }
}
