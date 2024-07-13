package _07_generic;

// 사람 관련 객체 상속 관계
// Person
//  ㄴ Teacher
//  ㄴ Student
//      ㄴ WebStudent
//      ㄴ MobileStudent

class Person {

}

class Teacher extends Person {

}

class Student extends Person {

}

class WebStudent extends Student {

}

class MobileStudent extends Student {

}

class Applicant<T> {
  public T kind;
  public Applicant(T kind) {
    this.kind = kind;
  }
}

// getClass() : 객체 클래스 정보 반환, class java.lang.String
// getSimpleName() : 클래스의 메소드 클래스의 간결한 이름만 반환
class Course {
  public static void registerA(Applicant<?> applicant) {
    System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) A 코스를 등록하였습니다.");
  }
  public static void registerB(Applicant<? extends Student> applicant) {
    System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) B 코스를 등록하였습니다.");
  }
  public static void registerC(Applicant<? super Teacher> applicant) {
    System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) C 코스를 등록하였습니다.");
  }
}

public class GenericEx03 {
  public static void main(String[] args) {
    Course.registerA(new Applicant<Person>(new Person()));
    Course.registerA(new Applicant<Teacher>(new Teacher()));
    Course.registerA(new Applicant<Student>(new Student()));
    Course.registerA(new Applicant<WebStudent>(new WebStudent()));
    Course.registerA(new Applicant<MobileStudent>(new MobileStudent()));

//    Student 관련 객체만 생성 가능
//    Course.registerB(new Applicant<Person>(new Person()));
//    Course.registerB(new Applicant<Teacher>(new Teacher()));
    Course.registerB(new Applicant<Student>(new Student()));
    Course.registerB(new Applicant<WebStudent>(new WebStudent()));
    Course.registerB(new Applicant<MobileStudent>(new MobileStudent()));

//    Student와 관련이 없는 객체만 생성 가능
    Course.registerC(new Applicant<Person>(new Person()));
    Course.registerC(new Applicant<Teacher>(new Teacher()));
//    Course.registerC(new Applicant<Student>(new Student()));
//    Course.registerC(new Applicant<WebStudent>(new WebStudent()));
//    Course.registerC(new Applicant<MobileStudent>(new MobileStudent()));
  }
}
