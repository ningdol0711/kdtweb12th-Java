// Shift + F10: Run code

// - 자바는 "클래스" 단위로 프로그램을 작성 -> 소스 파일 안에 반드시 클래스를 정의해야 함
// - 클래스 이름은 첫문자를 대문자로 작성하는 것이 관례 (PascalCase 방식)
// - 클래스의 구성요소(속성, 메서드, ...)는 클래스 블록({}) 안에 위치
// - 소스 파일 저장시 파일명과 클래스명이 반드시 일치해야 함 (단, 한 파일에 클래스가 여러 개 있는 경우는 제외)

// Main 클래스 (시작 클래스) 정의
// - main 메서드를 가짐
// - Main 클래스는 한 개로 메인 클래스로부터 프로그램이 시작됨 (node 에서 진입점 파일같은 역할)
public class Main {
    // Java 의 주석
    // 1. // 한 줄
    // 2. /* 여러 줄 */
    // 3. /** 문서 주석 */

    // main(String[] args)
    // - 메인 메서드는 자바 응용 프로그램의 시작점
    // - 어플리케이션 프로그램이 실행되려면 최소 1개 존재해야 함.
    // - 프로그램의 진입점으로 JVM 에 의해 최초 호출 -> 메인 메소드 블록 내부에 기술된 명령문들을 순차적으로 실행
    // - JVM 은 세미콜론(;)으로 끝나는 문장을 하나의 명령문으로 인식
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    // main 메서드의 String[] args 인자?
    // - 커맨드 라인에서 다음과 같이 프로그램 실행: ex. java MyProgram arg1 arg2 arg3 ...
    // - 각각의 인자는 args 배열에 저장되어 인덱싱이 가능
    // -> 다양한 값을 입력받아서 여러 작업을 수행 가능 (ex. 파일 경로, 환경 설정, 연결 정보 등)
}