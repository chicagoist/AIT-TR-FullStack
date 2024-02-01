package lesson_37.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OurArrayListTest {

  private OurArrayList<Integer> list;

  @BeforeEach
  public void setup() {
    list = new OurArrayList<>();
  }

  @Test
  public void testAppend() {
    list.append(1);
    list.append(2);
    list.append(3);

    Assertions.assertEquals(3, list.size());
    Assertions.assertEquals(1, list.get(0));
    Assertions.assertEquals(2, list.get(1));
    Assertions.assertEquals(3, list.get(2));
  }

  @Test
  public void testSet() {
    list.append(1);
    list.append(2);
    list.append(3);

    list.set(4, 1);

    Assertions.assertEquals(3, list.size());
    Assertions.assertEquals(1, list.get(0));
    Assertions.assertEquals(4, list.get(1));
    Assertions.assertEquals(3, list.get(2));
  }

  @Test
  public void testAdd() {
    list.add(0, 1);
    list.add(1, 2);
    list.add(2, 3);

    Assertions.assertEquals(3, list.size());
    Assertions.assertEquals(1, list.get(0));
    Assertions.assertEquals(2, list.get(1));
    Assertions.assertEquals(3, list.get(2));
  }

  @Test
  public void testRemove() {
    list.append(1);
    list.append(2);
    list.append(3);

    Integer removed = list.remove(2);

    Assertions.assertEquals(2, list.size());
    Assertions.assertEquals(1, list.get(0));
    Assertions.assertEquals(2, list.get(1));
    Assertions.assertEquals(null, list.get(2));
    Assertions.assertEquals(3, removed);
  }

  @Test
  public void testRemoveByValue() {
    list.append(1);
    list.append(2);
    list.append(3);

    boolean removed = list.remove(Integer.valueOf(2));

    Assertions.assertTrue(removed);
    Assertions.assertEquals(2, list.size());
    Assertions.assertEquals(1, list.get(0));
    Assertions.assertEquals(3, list.get(1));
  }

  @Test
  public void testClear() {
    list.append(1);
    list.append(2);
    list.append(3);

    list.clear();

    Assertions.assertEquals(0, list.size());
    Assertions.assertTrue(list.isEmpty());
  }

  @Test
  public void testToString() {
    list.append(1);
    list.append(2);
    list.append(3);

    String expected = "[1, 2, 3]";
    String actual = list.toString();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void testSize() {
    Assertions.assertEquals(0, list.size());

    list.append(1);
    list.append(2);
    list.append(3);

    Assertions.assertEquals(3, list.size());

    list.remove(1);

    Assertions.assertEquals(2, list.size());

    list.clear();

    Assertions.assertEquals(0, list.size());
  }

  @Test
  public void testIsEmpty() {
    Assertions.assertTrue(list.isEmpty());

    list.append(1);

    Assertions.assertFalse(list.isEmpty());

    list.clear();

    Assertions.assertTrue(list.isEmpty());
  }

  // Add more test methods as needed

}
