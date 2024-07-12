package _05_class._abstract;

// 추상 클래스
// 클래스의 공통적인 필드의 메소드를 추출해서 선언한 클래스
// abstract 키워드 사용
// new 연산자를 통해 객체 생성 불가능
// -> 직접 객체 생성자 사용 X, 사직 객체 생성자에서 super(...) 호출 추상 클래스 객체 생성 O
// 상속을 통해 자식 클래스를 만들 수 있음

// 실제 클래스 : 객체를 직접 생성할 수 있는 클래스 (Ex : Circle, Square)
// 추상 클래스 : 공통적인 특성을 추출해서 선언한 클래스 (Ex : Shape)
public abstract class Shape {
//    필드
    String Color;

//    생성자
    public Shape(String Color) {
        this.Color = Color;
    }

//    추상 메소드
//    -> 메소드 선언부만 있는 메소드
//    -> 자식 클래스에서 재정의(@Override)
//    -> 메소드의 선언은 동일하고 내용이 달라지는 경우 추상 메소드 사용
//    -> 자식 클래스는 추상 메소드를 재정의 하지 않으면 컴파일 에러 발생
    abstract void draw();

//    일반 메소드
    void start() {
        System.out.println("도형을 그려보자");
    }

    String getColor() {
        return this.Color;
    }
}
