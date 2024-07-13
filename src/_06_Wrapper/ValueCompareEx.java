package _06_Wrapper;

public class ValueCompareEx {
    public static void main(String[] args) {
        Integer obj1 = 10;
        Integer obj2 = 10;
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        Integer obj3 = 1000;
        Integer obj4 = 1000;
        System.out.println(obj3 == obj4);
        System.out.println(obj3.equals(obj4));

        Boolean bool1 = true;
        Boolean bool2 = true;
        System.out.println(bool1 == bool2);
        System.out.println(bool1.equals(bool2));

        Character char1 = 10;
        Character char2 = 10;
        System.out.println(char1 == char2);
        System.out.println(char1.equals(char2));
    }
}
