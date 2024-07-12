package _05_class._inheritance;

public class Student extends Person {
/*   public String campus;
//
//    public Student(String name, int age) {
//        // case1. 부모 클래스가 "기본 생성자" 갖는 경우
//        super(); // 부모 생성자 호출 (생략 가능, 컴파일 시 자동 추가)
//        System.out.println("자식 클래스 public Student(String name, int age) 생성자가 실행되었습니다.");
//
//        // 부모로 부터 상속받은 필드
//        this.name = name;
//        this.age = age;
//
//        // case2. 부모 클래스가 "매개변수를 갖는 생성자"를 갖는 경우
////        super(name, age); // 부모 생성자 호출
////        System.out.println("자식 클래스 public Student(String name, int age) 생성자가 실행되었습니다.");
//    }
//
//    public void setCampus(String campus) {
//        this.campus = campus;
//        System.out.println(campus + " 캠퍼스에서 공부중입니다.");
//    }
   */
    private String campus;

    public Student (String name, int age) {
//        부모로부터 상속받은 필드(name, age)의 값을 반환
//        각 필드가 private 이므로 setter 를 이용해 간접적으로 수정
        super();
        setName(name);
        setAge(age);
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
