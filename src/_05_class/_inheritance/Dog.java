package _05_class._inheritance;

public class Dog extends Animal {
//    메소드 오버라이딩 : 부모클래스의 makeSound 메소드 재정의
    @Override // @Override 는 작성하지 않아도 되지만 작성하는게 코드를 확인하는데에 편리하다.
    void makeSound() {
        super.makeSound();
        System.out.println("멍멍");
    }

    void fetch() {
        System.out.println("공 가져와!");
    }
}
// 부모 메소드의 호출
// 메소드 오버라이딩 : 부모 메소드는 숨겨지고, 자식 메소드를 사용한다.
// 오버라이딩 하려는 자식 메소드가 부모 메소드를 변경하더라도 중복된 내용을 자식 메소드도 가지고 있어야 한다.
// 자식 메소드에서 부모 메소드를 호출하면 숨겨진 부모 메소드를 호출할 수 있다.
// super.메소드이름(); : 부모 메소드 호출