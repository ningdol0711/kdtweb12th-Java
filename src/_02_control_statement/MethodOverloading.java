package _02_control_statement;

// 오버로딩
// - 하나의 클래스에서 동일한 이름의 메서드 여러 개 정의
// - 즉, 이름이 같고 매개변수 타입, 개수, 순서가 다름
// - 동작이 유사할 때 사용하면 편리

public class MethodOverloading {

    public static void main(String[] args) {
        // 객체 생성
        MethodOverloading ol = new MethodOverloading();

        // 객체의 메서드 호출
        System.out.println(ol.add(1, 2));
        System.out.println(ol.add(2.2, 3.3));
        System.out.println(ol.add(1, 2, 3));
        System.out.println(ol.add(1.1, 3.3, 5.6));
        System.out.println(ol.add(1.1, 2.2, 4.4)); // 7.700000000000001

        // 7.700000000000001 뭐지? 부동소수점의 한계, 근사값을 표현한 것 (즉, 7.7에 가까운 값)
        // - 작성하는 10진수는 컴퓨터가 이해하기 위해 2진수로 변환이 되어야 하는데, 10진 소수가 이진수로 정확한 변환이 안되는 케이스가 있다.
        // - 2의 거듭제곱 역수 (1/2, 1/4, 1/8, 1/16, ....)에 해당하는 소수들만이 이진법으로 정확하게 표현 가능
        // ex. 0.1 같은 10진소수는 이진수로 표현하면 "무한 순환소수" 0.1(10) = 0.0001100110011001100...(2) -> 이 값을 모두 다 표현하려면 메모리를 잡아먹겠죠?
        // 10진수에서 1/3 = 0.333333... 랑 유사한 케이스

    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

}
