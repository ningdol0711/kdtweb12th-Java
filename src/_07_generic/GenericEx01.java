package _07_generic;

import _03_array.ArrayListEx;

import java.util.ArrayList;

// 일반 클래스
class CustomList {
    ArrayList<String> list = new ArrayList<>();

    public void addElement(String element) {
        list.add(element);
    }

    public void removeElement(String element) {
        list.remove(element);
    }

    public String getElement(int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        return "Custom List = " + list;
    }
}

// 제네릭 클래스
class CustomListGeneric<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T getElement(int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        return "Custom List = " + list;
    }
}

public class GenericEx01 {
    public static void main(String[] args) {
        CustomList li = new CustomList();
        li.addElement("first");
        li.addElement("second");
        li.addElement("third");
        System.out.println(li.toString());

        li.removeElement("second");
        System.out.println(li.toString());

        System.out.println(li.getElement(0));
        System.out.println();
    }
}
