package _05_class._EX._Ex03;

public class Baek extends Student {
    public Baek(String name, int age, String school, int number) {
        super(name, age, school, number);
    }

    @Override
    public void todo() {
        System.out.println("점심은 백종원 피자");
    }
}
