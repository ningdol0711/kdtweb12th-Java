package _08_collection._set;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSetEx01 {
  public static void main(String[] args) {
    Set<String> set = new HashSet<String>();

    set.add("banana");
    set.add("david");
    set.add("orange");
    set.add("banana");
    System.out.println(set);

    Set<Course> hashset = new HashSet<>();
    Course Java = new Course(100, "Java");
    Course JS = new Course(101, "JS");
    Course TS = new Course(102, "TS");
    Course TS2 = new Course(102, "TS");
    System.out.println(Java.hashCode());
    System.out.println(JS.hashCode());
    System.out.println(TS.hashCode());
    System.out.println(TS2.hashCode());
    System.out.println(TS.equals(TS2));

    hashset.add(Java);
    hashset.add(JS);
    hashset.add(TS);
    hashset.add(TS2);
    System.out.println(hashset);
    System.out.println(hashset.size());

    for(Course c : hashset) {
      System.out.println(c);
    }

//    e.hasNext() : 다음 가져올 요소에 따라 boolean 타입 반환
    Iterator<Course> it = hashset.iterator();
    while(it.hasNext()) {
      Course c = it.next();
      System.out.println(c);
    }
  }
}
