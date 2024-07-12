package _04_exception;

import java.util.Arrays;
import java.util.Scanner;

// 다중 catch 블록: 여러 유형의 예외를 처리할 수 있음
public class MultipleCatchEx {

    public static void main(String[] args) {

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            System.out.println("숫자를 입력하세요: ");
            String input = scanner.nextLine();

            // 문자열을 정수로 변환
            int number = Integer.parseInt(input); // NumberFormatException 예외 발생 가능성

            // 입력받은 숫자를 나누기 시도
            int dividedResult = 100 / number; // ArithmeticException 예외 발생 가능성

            // 결과 출력
            System.out.println("숫자 100을 " + number + "로 나눈 결과: " + dividedResult);

            // 배열 접근 시도
            int[] array = new int[5]; // [0, 0, 0, 0, 0]
            array[number] = 10;
            System.out.println(number + " 인덱스의 값을 10으로 수정했습니다: " + Arrays.toString(array));

        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자 형식이 잘못되었습니다: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("[ERROR] 0으로 나눌 수 없습니다: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[ERROR] 배열 인덱스가 범위를 벗어났습니다: " + e.getMessage());
        } catch (Exception e) {
            // General exception handler
            // - 예상치 못한 예외나 명시적으로 처리하지 않은 예외를 잡는 "마지막 방어선"
            // - 마지막 방어선이므로 일반적으로는 가장 마지막 catch 절로 사용
            System.out.println("[ERROR] 알 수 없는 예외가 발생했습니다: " + e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다.");
            if (scanner != null) {
                scanner.close();
            }
        }

    }

}
