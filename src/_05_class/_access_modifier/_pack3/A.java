package _05_class._access_modifier._pack3;

// 필드와 메소드의 접근 제어자
public class A {
    public int field1; // public field
    int field2; // default field
    private int field3; // private field

    // constructor
    public A() {
        // 클래스 내부이므로 접근 제어자의 영향을 받지 않음
        this.field1 = 1;
        this.field2 = 2;
        this.field3 = 3;

        method1();
        method2();
        method3();
    }

    // public method
    public void method1() {}

    // default method
    void method2() {}

    // private method
    private void method3() {}

}
