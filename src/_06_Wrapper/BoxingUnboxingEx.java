package _06_Wrapper;

public class BoxingUnboxingEx {
    public static void main(String[] args) {
        Integer obj1 = 300;
        Double obj2 = 3.14;
        Character obj3 = 'A';
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        int value1 = obj1;
        double value2 = obj2;
        char value3 = obj3;
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        int result1 = obj1 + 200;
        double result2 = obj2 + 280;
        char result3 = (char) (obj3 + 1);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
