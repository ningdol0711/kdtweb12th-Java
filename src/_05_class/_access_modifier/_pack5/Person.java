package _05_class._access_modifier._pack5;

public class Person {
    // private field 선언
    private int age;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public int getAge() { return this.age; }

    public String getName() { return this.name; }

    // 사람의 나이는 양수
    // 외부에서 나이를 음수로 설정하고자 한다면, 0으로 변경
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
            return;
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

}
