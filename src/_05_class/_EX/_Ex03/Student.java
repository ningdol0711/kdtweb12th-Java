package _05_class._EX._Ex03;

public abstract class Student {
    String name;
    String age;
    String school;
    String number;

    public Student(String name, int age, String school, int number) {
        this.name = name;
        this.age = age+"";
        this.school = school;
        this.number = number+"";
        getInfo();
    }

    abstract void todo();

    public void getInfo() {
        System.out.println("=== " + name + "학생의 정보 ===");
        System.out.println("학교 : " + school);
        System.out.println("나이 : " + age);
        System.out.println("학번 : " + number);
        todo();
    }
}
