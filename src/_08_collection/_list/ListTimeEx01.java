package _08_collection._list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTimeEx01 {
  public static void main(String[] args) {
    ArrayList<String> li1 = new ArrayList<>();
    LinkedList<String> li2 = new LinkedList<>();

    long startTime = System.nanoTime();
    for(int i=0;i<100000;i++) {
      li1.add(0, String.valueOf(i));
    }
    long endTime = System.nanoTime();
    System.out.println("ArrayList : " + (endTime - startTime));

    startTime = System.nanoTime();
    for(int i=0;i<100000;i++) {
      li2.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("LinkedList : " + (endTime - startTime));
  }
}
