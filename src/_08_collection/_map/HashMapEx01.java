package _08_collection._map;

import _08_collection._set.Course;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx01 {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "홍길동");
    map.put(2, "이춘향");
    map.put(3, "성몽길");
    System.out.println(map);
    System.out.println("학생 수 : " + map.size());

    System.out.println("2번 학생 : " + map.get(2));

    Set<Entry<Integer, String>> set = map.entrySet();
    System.out.println(set);
    System.out.println();

    Iterator<Entry<Integer, String>> it = set.iterator();
    while(it.hasNext()) {
      Entry<Integer, String> entry = it.next();
      Integer key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + " : " + value);
    }
    System.out.println();

    Set<Integer> set1 = map.keySet();
    System.out.println(set1);

    String delVal = map.remove(1);
    System.out.println(delVal);
    System.out.println(map);
  }
}
