package ru.itpark;

public class MainLinkedListIterator {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("Marsel");
    list.add("Shamil");
    list.add("Roman");
    list.add("Adel");
    list.add("Rustem");
    list.add("Sergey");
    list.add("Damir");
    list.add("Nastya");
    list.add("Egor");
    list.add("Ilya");
    list.add("Marsel");
    list.add("Nailya");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
