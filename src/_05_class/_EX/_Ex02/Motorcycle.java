package _05_class._EX._Ex02;

public class Motorcycle extends Vehicles{
    void Info() {
        Brand = "두카티";
        Model = "파니갈래";
        Year = "2022";
        System.out.println("=== Motorcycle Information ===");
        System.out.printf("Brand : " + Brand);
        System.out.printf(", Model : " + Model);
        System.out.println(", Year : " + Year);
    }
    @Override
    void Middle() {
        System.out.println("전국일주를 돕니다.");
    }
}
