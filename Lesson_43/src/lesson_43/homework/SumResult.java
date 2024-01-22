package lesson_43.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SumResult {

    private int sum;

    public SumResult(String nameOfFile) {
        File fileName = new File(nameOfFile);
        this.sum = findSum(fileName);
    }

    private int findSum(File fileName) {

        try(BufferedReader reader =
                    new BufferedReader(new FileReader(fileName))) {
            String number;

            while((number = reader.readLine()) != null) {
                sum += Integer.parseInt(number.trim());
            }
        } catch(IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (NumberFormatException ex) {
            System.err.println("Ошибка при парсинге числа: " + ex.getMessage());
        }
        return sum;
    }

    public int getSum() {
        return this.sum;
    }
}
