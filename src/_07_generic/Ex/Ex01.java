package _07_generic.Ex;

class Pair<K, V> {
  private K key;
  private V value;
  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }
  public K getKey() {
    return key;
  }
  public V getValue() {
    return value;
  }
}

public class Ex01 {
  public static void main(String[] args) {
    Pair<String, Integer> p = new Pair<>("Hello", 1);
    System.out.printf("Key : " + p.getKey() + " Value : " + p.getValue());
    System.out.println();

    Pair<Integer, String> pIS = new Pair<>(2, "world");
    System.out.printf("Key : " + pIS.getKey() + " Value : " + pIS.getValue());
    System.out.println();
  }
}
