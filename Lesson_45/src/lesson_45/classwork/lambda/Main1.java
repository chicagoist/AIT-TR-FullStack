package lesson_45.classwork.lambda;

import lesson_45.classwork.Checkable;
import lesson_45.classwork.Concatable;
import lesson_45.classwork.Transformable;

public class Main1 {
    public static void main(String[] args) {

        Operationable<Integer> op = (x, y) -> (x + y);
        System.out.println(op.calculate(2, 3));

        Operationable<String> opStr = (x, y) -> (x + y);
        System.out.println(opStr.calculate("Hello ", "world!"));


        int[] ints = {10, 20, 30, 40, 50};
        IsMoreInterface condition = n -> n > 20;
        System.out.println(condition.isMore(15));
        System.out.println(condition.isMore(25));

        System.out.println(sumIfCond(ints,condition));

        Concatable concate = (a,b) -> Integer.toString(a) + b;
        System.out.println(concate.concat(1,7));

        Checkable check = str -> str.length() == 3;
        System.out.println(check.check("abc"));
        System.out.println(check.check("abcd"));

        check = str -> (str.length() % 2) == 0;
        System.out.println("Chek of even or not");
        System.out.println(check.check("abc"));
        System.out.println(check.check("abcd"));

        Transformable trans = str -> str.toUpperCase();
        System.out.println(trans.modify("hello world!"));

        trans = str -> str.length() == 4 ? "****" : str;
        System.out.println(trans.modify("hell"));
        System.out.println(trans.modify("hel"));





    }

    public static int sumIfCond(int[] ints,
                                IsMoreInterface lambdaExpression) {
        int sum = 0;

        for(int number : ints) {
            if(lambdaExpression.isMore(number)) {
                sum += number;
            }
        }
        return sum;
    }
}
