package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        // if-else 문
        int number = 10;
        if (number % 2 == 0) {
            System.out.printf("숫자 %d 은(는) 짝수입니다.\n", number);
        } else {
            System.out.printf("숫자 %d 은(는) 홀수입니다.\n", number);
        }
        
        // 문자열(String) 객체 비교
        System.out.println("이름을 입력해주세요 >> ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // Enter 이전까지의 문자열을 읽음
        System.out.println("name = " + name);

        // Bad case (`==` 비교 연산자 사용)
//        if (name == "코딩온") { // 문제: "코딩온"을 올바르게 입력해도 else 절로 넘어감
//            System.out.println("코딩온 님 환영합니다!");
//        } else {
//            System.out.println("이름을 다시 확인해주세요...");
//        }

        // Good case (`.equals() 메서드를 사용)
        if (name.equals("코딩온")) {
            System.out.println("코딩온 님 환영합니다!");
        } else {
            System.out.println("이름을 다시 확인해주세요...");
        }

        // WHY?
        // - `==` 연산자: 두 객체의 참조를 비교 (동일한 메모리 위치 가리키는지를 확인)
        // - `.equals()` 메서드: 두 객체의 "내용"이 동일한지 비교

        // "문자열 리터럴"의 경우, Java 에서 특별한 취급
        // - 동일한 문자열이 사용될 경우, Java 컴파일러가 문자열 풀(string pool) 이라는 공유된 메모리 영역에 해당 문자열을 저장
        // - 변수 str1 과 str2 는 같은 문자열을 가르키고 있으므로 "같은 참조를 가르킴"
        String str1 = "hello";
        String str2 = "hello";

        if (str1 == str2) {
            System.out.println("같은 참조 값을 가르킵니다."); // 출력
        } else {
            System.out.println("서로 다른 참조 값을 가르킵니다.");
        }

        // - 문자열 "동적 할당"의 경우, `new String(...)` 을 사용해 새로운 문자열 객체를 만들면, 서로 다른 객체를 가르킴
        // - 변수 str3 과 str4 가 서로 다른 객체 (서로 다른 참조를 가르킴)
        String str3 = new String("hi");
        String str4 = new String("hi");

        if (str3 == str4) {
            System.out.println("같은 참조를 가르킵니다.");
        } else {
            System.out.println("서로 다른 참조 값을 가르킵니다."); // 출력
        }

        if (str3.equals(str4)) {
            System.out.println("내용이 같습니다."); // 출력
        } else {
            System.out.println("내용이 다릅니다.");
        }

        // if - else if - else 문
        // - top down 방식으로 처음 조건식이 참으로 평가되면 해당 식 수행 후에 if 절을 빠져나감
        if (number % 3 == 0) {
            System.out.println("3의 배수");
        } else if (number % 5 == 0) {
            System.out.println("5의 배수");
        } else if (number % 2 == 0) {
            System.out.println("2의 배수");
        } else {
            System.out.println("3의 배수도 2의배수도 5의 배수도 아님");
        }

        // switch case 문
        // - 각 case 문의 break 문은 선택 사항으로 break 문 새얅하면 바로 밑의 case 로 넘어감
        // - 여러 case 문에 하나의 시행문 지정 가능
        String dayOfWeek;
        int day = 3;

        switch (day) {
            case 1:
                dayOfWeek = "일요일";
                break;
            case 7:
                dayOfWeek = "토요일";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dayOfWeek = "평일";
                break;
            default:
                dayOfWeek = "잘못된 입력";
                break;
        }

        System.out.printf("%s 입니다.", dayOfWeek);
    }

}
