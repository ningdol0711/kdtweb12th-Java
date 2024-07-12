package _05_class._inheritance;

// 부모 클래스 (슈퍼 클래스): Person
// 자식 클래스 (서브 클래스): Student
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {}

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {

    }
}
