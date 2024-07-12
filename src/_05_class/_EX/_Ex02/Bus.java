package _05_class._EX._Ex02;

public class Bus extends Vehicles{
    void Info() {
        Brand = "현대";
        Model = "슈퍼에어로시티";
        Year = "2022";
        System.out.println("=== Bus Information ===");
        System.out.printf("Brand : " + Brand);
        System.out.printf(", Model : " + Model);
        System.out.println(", Year : " + Year);
    }
    @Override
    void Middle() {
        System.out.println("열심히 일합니다.");
    }
}
