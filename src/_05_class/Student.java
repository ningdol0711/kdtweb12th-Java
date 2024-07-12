package _05_class;

// 클래스
// - 객체 지향 프로그래밍의 기초
// - 클래스를 통해 인스턴스 생성
public class Student { // (공개) 클래스 선언

    // 필드(속성)
    public String name;
    public int grade;

    // 생성자
    public Student(String name, int grade) {
        // this: 자기자신
        this.name = name; // 매개변수의 name 을 현재 객체의 name 멤버 변수에 할당
        this.grade = grade; // 매개변수의 grade 를 현재 객체의 grade 멤버 변수에 할당
    }

    // 메소드
    // 1) 인자 x, 반환값 x
    public void goToSchool() {
        System.out.println("학교 가자");
    }

    // 2) 인자 o, 반환값 x
    public void study(String subject) {
        System.out.println(subject + " 과목 공부중입니다.");
    }

    // 3) 인자 x, 반환값 o
    public int getGrade() {
        return this.grade;
    }

    // 4) 인자 o, 반환값 o
    public String getTestResult(int score) {
        return this.name + "학생의 점수: " + score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
