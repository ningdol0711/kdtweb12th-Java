package _05_class;

public class StudentEx {

    public static void main(String[] args) {
        // new 키워드를 이용해 s1 객체 생성
        Student s1 = new Student("김철수", 1); // s1 변수가 Student 객체 참조

        System.out.println(s1);

        // 메서드 호출
        s1.goToSchool();
        s1.study("Java 프로그래밍");
        System.out.println(s1.getGrade() + "학년");
        System.out.println(s1.getTestResult(100));
        
        Student s2 = new Student("이찬혁", 2);
        System.out.println("s2 = " + s2);
        
    }

}
