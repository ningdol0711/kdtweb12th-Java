package _03_array;

// Collection Framework
// - 객체를 효율적으로 추가/삭제/검색할 수 있도록 관련 인터페이스 & 클래스를 java.util 패키지에 포함시켜 놓음

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ArrayList 클래스
// - List 컬렉션에서 가장 많이 사용된는 컬렉션
// - 표준 배열보다 조금 느릴 수 있으나, 배열에서 많은 조작이 필요한 경우 유용
// - 동적 할당이 가능 (= 크기를 미리 지정하지 않아도 됨, 일반 배열과의 차이점)
// - List 컬렉션은 객체 자체를 저장하는 것이 아니라 객체의 참조값을 저장
//      => 동일한 객체를 중복저장 가능, 이는 동일한 번지수가 저장되는 것을 의미
//      => null 도 저장할 수 있음
public class ArrayListEx {
    // 작성 방법
    // 1) List<E> list = new ArrayList<E>(); // E에 지정된 타입의 객체만 지정 가능
    // 2) List<E> list = new ArrayList<>(); // 1번 방법의 간소화된 문법
    // 3) List list = new ArrayList(); // 모든 타입의 객체 저장 -> 타입 안전성 보장되지 않음

    // 참고. 변수 타입 선언 시 List, ArrayList 모두 사용 가능
    // - 같은 결과를 의미하지만, List 를 이용해 ArrayList 를 생성하면
    //           "다형성(하나의 객체가 여러 타입을 가짐)"을 이용하므로 유연함
    // ArrayList<E> list = new ArrayList<E>();

    // 도형 shape = new 삼각형(); // 다양한 도형으로 받을 수 있음
    // 삼각형 shape = new 삼각형(); // 오로지 삼각형만 받을 수 있음

    public static void main(String[] args) {
        // 1. ArrayList 생성 (정수형 요소를 저장하는 예제)
        List<Integer> numbers = new ArrayList<>();

        // 2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("numbers = " + numbers);

        // 3. 요소 접근
        System.out.println("첫번째 요소 = " + numbers.get(0));

        // 4. 요소 수정
        numbers.set(1, 77);
        System.out.println("numbers = " + numbers);
        System.out.println("numbers = " + Arrays.toString(numbers.toArray()));

        // 5. 요소 삽입
        numbers.add(1, 7);
        System.out.println("numbers = " + numbers);

        // 6. ArrayList 끼리 연결
        System.out.println(Arrays.asList(100, 99, 98)); // 주어진 요소들로 고정 크기의 List 생성
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(100, 99, 98));
        numbers.addAll(numbers2);
        System.out.println("numbers = " + numbers);

        // 7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10)); // 0 인덱스에 인자 값이 존재함
        System.out.println(numbers.indexOf(100)); // 6 인덱스에 인자 값이 존재함
        System.out.println(numbers.indexOf(5)); // -1: 인자 값이 ArrayList 에 존재하지 않음

        // 8. 요소 삭제
        numbers.remove(2);
        System.out.println("numbers = " + numbers);

        // 9. 리스트 크기 확인
        System.out.println("size of numbers = " + numbers.size());

        // 10. 모든 요소 출력
        for (Integer n: numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 11. 요소 포함 확인
        System.out.println("요소 확인: " + numbers.contains(7));
        System.out.println("요소 확인: " + numbers.contains(77));

        // 12. 모든 요소 삭제
        numbers.clear();
        System.out.println("numbers = " + numbers);

        ////////////////////////////////////////////////
        // Student 타입의 ArrayList 생성
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", 10));
        students.add(new Student("Jennie", 11));
        students.add(new Student("Rose", 12));
        students.add(new Student("Lily", 13));
        students.add(new Student("Say", 14));

        System.out.println("students = " + students);

        System.out.println("size of students = " + students.size());

        Student std1 = students.get(0); // 0번 학생 확인
        System.out.println(std1.getName() + " 학생의 나이는 " + std1.getAge() + " 세 입니다!");

        System.out.println("==== 학생 명단 ====");
        for(Student std : students) {
            System.out.println(std.getName() + "(" + std.getAge() +")");
        }

        students.remove(2);
        System.out.println("students = " + students);
        students.remove(2); // 에러 x: 3번 인덱스가 2번 인덱스로 바뀜로 삭제됨
        System.out.println("students = " + students);

    }

}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    // 객체를 문자열로 표현할 때 어떻게 출력할지를 정의할 수 있는 기능
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

