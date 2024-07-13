package _08_collection._list;

import java.util.LinkedList;

public class LinkedListEx01 {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();

    list.add("A");
    list.add("B");
    list.add("C");
    System.out.println(list);

//    addFirst(), addLast : LinkedList 특화
    list.addFirst("D");
    list.addLast("1");
    System.out.println(list);

//    특정 위치에 요소 삽입
    list.add(2, "E");
    System.out.println(list);

//    첫번쨰, 마지막 요소 가져오기 LinkedList 특화
    System.out.println(list.getFirst());
    System.out.println(list.getLast());

    list.remove("E");
    System.out.println(list);

    String first = list.removeFirst();
    String last = list.removeLast();
    System.out.println(list);
    System.out.println(first);
    System.out.println(last);

//    요소 포함
    System.out.println("A요소 포함 여부 : " + list.contains("A"));

    for(String f : list) {
      System.out.println(f);
    }
  }
}
