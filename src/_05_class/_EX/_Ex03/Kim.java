package _05_class._EX._Ex03;

public class Kim extends Student {
    public Kim(String name, int age, String school, int number) {
        super(name, age, school, number);
    }

    @Override
    public void todo() {
        System.out.println("점심은 김가네 김밥");
    }
}
