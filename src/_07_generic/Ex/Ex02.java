package _07_generic.Ex;

class Calculator<T extends Number> {
  private T num1;
  private T num2;

  public Calculator(T num1, T num2) {
    this.num1 = num1;
    this.num2 = num2;
  }
  public double add() {
    return num1.doubleValue() + num2.doubleValue();
  }
}

public class Ex02 {
  public static void main(String[] args) {
    Calculator<Integer> c1 = new Calculator<>(3, 5);
    Calculator<Double> c2 = new Calculator<>(3.14, 5.21354);
    System.out.println(c1.add());
    System.out.println(c2.add());
  }
}
