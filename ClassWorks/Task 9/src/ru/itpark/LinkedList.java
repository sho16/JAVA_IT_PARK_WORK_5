package ru.itpark;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {

  private Node top;
  private Node last;
  private int count;
  private T data[];

  private class Node {
    T value;
    Node next;

    Node(T value) {
      this.value = value;
    }
  }

  @Override
  public T get(int index) {
    if (index < count) {
      int i = 0;

      Node current = top;

      while (i < index) {
        current = current.next;
        i++;
      }

      return current.value;
    }
    throw new IndexOutOfBoundsException();
  }

  @Override
  public void delete(int index) {

  }

  @Override
  public void add(T element) {
    // создал узел для связного списка
    Node newNode = new Node(element);
//    Без last
//    if (top == null) {
//      top = newNode;
//    } else {
//      Node current = top;
//      while (current.next != null) {
//        current = current.next;
//      }
//
//      current.next = newNode;
//    }
    if (top == null) {
      top = newNode;
      last = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }
    count++;
  }


  private class LinkedListIterator implements Iterator<T> {
    private int current = 0;

    @Override
    public boolean hasNext() {
      return current < count;
    }

    @Override
    public T next() {
      T element = data[current];
      current++;
      return element;
    }






  @Override
  public boolean contains(T element) {
    return false;
  }

  @Override
  public int size() {
    return count;
  }

  @Override
  public boolean delete(T element) {
    return false;
  }


}
