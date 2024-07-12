package _05_class._access_modifier._pack5;

public class PersonEx {

    public static void main(String[] args) {
        // 객체 생성
        Person p1 = new Person("minion");
        Person p2 = new Person("pooh");

//        p1.age = 4; // private field 이므로 compile error
        p1.setAge(4); // public method 를 이용해 간접적으로 필드 값 변경
        System.out.println(p1.getName() + " 의 나이 : " + p1.getAge());

        p2.setAge(-6); // 나이 값이 음수라면 setAge 내부 로직에 의해 0으로 변경
        System.out.println(p2.getName() + " 의 나이 : " + p2.getAge());

    }

}


