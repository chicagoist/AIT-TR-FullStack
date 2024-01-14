package lesson_37.homework;

import java.util.*;

public class OurArrayList<E> implements OurList<E> {

  private static final int DEFAULT_INITIAL_SIZE = 10;
  private E[] array;
  private int size = 0;

  public OurArrayList() {
    this(DEFAULT_INITIAL_SIZE);
  }

  public OurArrayList(int length) {
    array = (E[]) new Object[length];
  }

  @Override
  public void append(E value) {
    if (array.length == size) {
      enlargeArray();
    }
    array[size] = value;
    size++;
  }

  private void enlargeArray() {
    E[] newSource = (E[]) new Object[array.length * 2];
    for (int i = 0; i < array.length; i++) {
      newSource[i] = (E) array[i];
    }
    array = newSource;
  }

  @Override
  public void set(E value, int index) {
    if(index >= size || index < 0)
      return ;
    array[index] = value;
  }

  public void add(E value) {
    add(size, value);
  }

  public void add(int index, E value) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException();
    }

    if (size == array.length) {
      int oldLength = array.length;
      int newLength = (2 * oldLength);
      E[] newArray = (E[]) new Object[newLength];
      System.arraycopy(array, 0, newArray, 0, size);
      array = newArray;

      System.out.printf("Inner array size increased: %s->%s",oldLength, newLength);
    }

    if (index < size) {
      for (int i = size - 1; i >= index; i--) {
        array[i + 1] = array[i];
      }
    }
    array[index] = value;
    size++;
  }

  @Override
  public E get(int index) {
    if(index >= size || index < 0)
      return null;
    return(E) array[index];
  }

  @Override
  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E remove(int index) {
    if (index >= size || index < 0)
      return null;

    E result = (E) array[index];
    for (int i = index + 1; i < size; i++) {
      array[i - 1] = array[i];
    }
    array[size - 1] = null;
    size--;

    return result;
  }

  @Override
  public boolean remove(E value) {
    for( int i = 0; i < array.length; i++){
      if(array[i].equals(value)){
        remove(i);
        return true;
      }
    }
    return false;
  }

  public void clear() {
    // Сбрасываем массив и размер до исходных значений.
    array = (E[]) new Object[DEFAULT_INITIAL_SIZE];
    size = 0;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < size(); i++) {
      sb.append(get(i));
      if (i < size() - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }
}
