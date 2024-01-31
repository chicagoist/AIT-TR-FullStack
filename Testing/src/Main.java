public class Main {
    public static void main(String[] args) {

/*       Super super1 = new Super();
        System.out.println(super1.toString());*/

        Middler middler = new Middler();
        System.out.println(middler.toString());

        System.out.println("middler.middleNumber = "+middler.middleNumber);
        System.out.println("middler.middleString = " + middler.middleString);

        System.out.println("middler.superNumber = " +middler.superNumber);
        System.out.println("middler.superString = " +middler.superString);

    }
}
