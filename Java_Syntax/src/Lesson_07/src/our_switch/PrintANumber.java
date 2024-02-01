package our_switch;

public class PrintANumber {
  protected static void printANumber(int number) {
    switch (number) {
      case 1:
        System.out.println("1");
      case 2:
        System.out.println("2");
      case 3:
        System.out.println("3");
      case 4:
        System.out.println("4");
      case 5:
        System.out.println("5");
      default:
        System.out.println("default");
    }
  }
}
