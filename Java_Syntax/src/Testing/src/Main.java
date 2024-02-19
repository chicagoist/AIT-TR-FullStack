import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

/*       Super super1 = new Super();
        System.out.println(super1.toString());*/

        Middler middler = new Middler();
        System.out.println(middler.toString());
        Field[] declaredFields = middler.getClass().getDeclaredFields();

        Method[] declaredMethods = middler.getClass().getDeclaredMethods();

        System.out.println("getDeclaredFields() = " + Arrays.toString(declaredFields));
        System.out.println("getMethods() = " + Arrays.toString(declaredMethods));

        System.out.println("middler.middleNumber = " + middler.middleNumber);
        System.out.println("middler.middleString = " + middler.middleString);

        System.out.println("middler.superNumber = " + middler.superNumber);
        System.out.println("middler.superString = " + middler.superString);

    }
}
