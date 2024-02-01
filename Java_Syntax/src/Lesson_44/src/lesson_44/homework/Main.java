package lesson_44.homework;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Task 1
        Producable producable = () -> {
            return "Hello World";
        };
        System.out.println(producable.produce());
        ///
        String string = "строка";
        Printable printable = (s) -> {
            System.out.printf("!%s!", s);
        };
        printable.print(string);

        // Task 2
        System.out.println();
        List<Personn> sortedPersons = Personn.composeList("people.txt");


        Writeable writeableToFile = (String filename, List<Personn> list) -> {
            try(BufferedWriter bufferedWriter =
                        new BufferedWriter(new FileWriter(filename, true))) {

                String pattern = "MM/dd/yyyy HH:mm:ss";
                for(Personn person : list) {
                    bufferedWriter.write(String.valueOf(person) + " {" + (new SimpleDateFormat(pattern).format(Calendar.getInstance().getTime())) + "}" + "\n");
                }
            } catch(IOException exception) {
                exception.printStackTrace();
            }
        };


        String filename = "homeworlesson44.txt";
        writeableToFile.writeToFile(filename, sortedPersons);

    }
}
/* OUTPUT
// Task 1
Hello World
!строка!
Process finished with exit code 0

//Task 2
name = Peter, age = 37 {01/23/2024 22:27:49}
name = John, age = 90 {01/23/2024 22:27:49}
 */
