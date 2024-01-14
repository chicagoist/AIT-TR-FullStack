package lesson_37.homework;

public interface OurList<E> {

  void append(E value);

  void add(E value);

  void add(int index, E value);

  E get(int index);

  void set(E value, int index);

  int size();

  boolean remove(E value);

  E remove(int index);

  public boolean isEmpty();
}
