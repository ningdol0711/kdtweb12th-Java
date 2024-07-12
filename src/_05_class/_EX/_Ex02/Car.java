package _05_class._EX._Ex02;

public class Car extends Vehicles {
    void Info() {
        Brand = "현대";
        Model = "아이오닉 5";
        Year = "2022";
        System.out.println("=== Car Information ===");
        System.out.printf("Brand : " + Brand);
        System.out.printf(", Model : " + Model);
        System.out.println(", Year : " + Year);
    }
    @Override
    void Middle() {
        System.out.println("가족여행을 떠납니다.");
    }
}
