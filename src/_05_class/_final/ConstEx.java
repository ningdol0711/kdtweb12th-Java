package _05_class._final;

public class ConstEx {

    public static void main(String[] args) {
        // 상수 읽기
        // static field 로 객체 생성 없이 접근
        System.out.println(Const.GREETING);
        System.out.println(Const.MAX_VALUE);

        // 상수는 값을 변경할 수 없기 때문에 컴퍼일 에러 발생 (final)
//        Const.GREETING = "Hi";
//        Const.MAX_VALUE = 200;
    }

}
