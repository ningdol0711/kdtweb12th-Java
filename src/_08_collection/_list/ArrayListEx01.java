package _08_collection._list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {
  public static void main(String[] args) {
    List<Book> list = new ArrayList<>();

    list.add(new Book("제목 1", "지은 1"));
    list.add(new Book("제목 2", "지은 2"));
    list.add(new Book("제목 3", "지은 3"));
    list.add(new Book("제목 4", "지은 4"));
    list.add(new Book("제목 5", "지은 5"));
    list.add(new Book("제목 6", "지은 6"));
    System.out.println(list);

    System.out.println("list.size() : " + list.size());
    System.out.println("list.get(0) : " + list.get(0));
    System.out.println(list.remove(2));
    System.out.println(list);

    for(Book book : list) {
      System.out.println(book);
    }

    checkBook(list);
    list.clear();
    checkBook(list);
  }

  private static void checkBook(List<?> list) {
    System.out.println("list is empty : " + list.isEmpty());
  }
}
