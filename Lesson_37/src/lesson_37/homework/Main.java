package lesson_37.homework;

public class Main {
  public static void main(String[] args) {
    OurArrayList<Integer> list = new OurArrayList<>();

    System.out.println("\nlist.append():");
    list.append(1);
    list.append(2);
    list.append(3);
    System.out.printf("Expected = %d, Actual = %d\n", 3, list.size());
    System.out.printf("Expected = %d, Actual = %d\n", 1, list.get(0));
    System.out.printf("Expected = %d, Actual = %d\n", 2, list.get(1));
    System.out.printf("Expected = %d, Actual = %d\n", 3, list.get(2));

    System.out.println("\nlist.set(4, 1):");
    list.set(4, 1);
    System.out.printf("Expected = %d, Actual = %d\n", 3, list.size());
    System.out.printf("Expected = %d, Actual = %d\n", 1, list.get(0));
    System.out.printf("Expected = %d, Actual = %d\n", 4, list.get(1));
    System.out.printf("Expected = %d, Actual = %d\n", 3, list.get(2));

    System.out.println("\nlist.add():");
    list.add(0, 1);
    list.add(1, 2);
    list.add(2, 3);
    System.out.printf("Expected = %d, Actual = %d\n", 6, list.size()); //
    // увеличенный размер массива в 2 раза = 6
    System.out.printf("Expected = %d, Actual = %d\n", 1, list.get(0));
    System.out.printf("Expected = %d, Actual = %d\n", 2, list.get(1));
    System.out.printf("Expected = %d, Actual = %d\n", 3, list.get(2));

    System.out.println("\nlist.remove(2)");
    int removed = list.remove(2);
    System.out.printf("Expected = %d, Actual = %d\n", 5, list.size());
    System.out.printf("Expected = %d, Actual = %d\n", 1, list.get(0));
    System.out.printf("Expected = %d, Actual = %d\n", 2, list.get(1));
    System.out.printf("Expected = %d, Actual = %d\n", 3, removed);

    System.out.println("\nRemoveByValue()");
    System.out.println(list.toString());
    System.out.printf("Значение, находящееся по индексу 3 = %d", list.get(3));
    list.remove(list.get(Integer.valueOf(3)));
    System.out.println("\n" + list.toString());

    System.out.println("\nlist.clear()");
    System.out.println(list.toString());
    list.clear();
    System.out.println(list.toString());
    System.out.println(list.isEmpty());

    System.out.println("\ntoString");
    list.append(1);
    list.append(2);
    list.append(3);
    String expected = "[1, 2, 3]";
    if (expected.equals(list.toString())) {
      System.out.println(list.toString());
    }

    System.out.println("\nsize():");
    list.clear();
    list.append(Integer.valueOf(1));
    list.append(2);
    list.append(3);
    System.out.println(list.toString());

    System.out.printf("Expected = %d, Actual = %d\n", 3, list.size());
    list.remove(1);
    System.out.println(list.toString());
    System.out.printf("Expected = %d, Actual = %d\n", 2, list.size());
    list.clear();
    System.out.println(list.toString());
    System.out.printf("Expected = %d, Actual = %d\n", 0, list.size());

    System.out.println("\nlist.isEmpty():");
    if (list.isEmpty()) {
      System.out.println("list is empty");
    } else {
      System.out.println("list is not empty");
    }
    list.add(1);

    if (list.isEmpty()) {
      System.out.println("list is empty");
    } else {
      System.out.println("list is not empty");
    }
  }
}
/* OUTPUT

list.append():
Expected = 3, Actual = 3
Expected = 1, Actual = 1
Expected = 2, Actual = 2
Expected = 3, Actual = 3

list.set(4, 1):
Expected = 3, Actual = 3
Expected = 1, Actual = 1
Expected = 4, Actual = 4
Expected = 3, Actual = 3

list.add():
Expected = 6, Actual = 6
Expected = 1, Actual = 1
Expected = 2, Actual = 2
Expected = 3, Actual = 3

list.remove(2)
Expected = 5, Actual = 5
Expected = 1, Actual = 1
Expected = 2, Actual = 2
Expected = 3, Actual = 3

RemoveByValue()
[1, 2, 1, 4, 3]
Значение, находящееся по индексу 3 = 4
[1, 2, 1, 3]

list.clear()
[1, 2, 1, 3]
[]
true

toString
[1, 2, 3]

size():
[1, 2, 3]
Expected = 3, Actual = 3
[1, 3]
Expected = 2, Actual = 2
[]
Expected = 0, Actual = 0

list.isEmpty():
list is empty
list is not empty

Process finished with exit code 0


 */
