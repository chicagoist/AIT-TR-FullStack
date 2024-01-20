package lesson_42.homework;

/*
   Поймать исключение (с выводом на экран его типа),которое возникает при
   выполнении следующего кода int a = 40/0

   Поймать исключение (с выводом на экран его типа),которое возникает при
   выполнении следующего кода
   String s =null;
   String m = s.toLowerCase()

   Поймать исключение (с выводом на экран его типа),которое возникает при
   выполнении следующего кода
   int[] m = new int[2]
   m[8]=5

*/

public class Main {
  public static void main(String[] args) {

    try {
      String s = null;
      String m = s.toLowerCase();

      int a = 40 / 0;


    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch(NullPointerException n) {
      System.out.println(n.getMessage());
    }
  }
}
