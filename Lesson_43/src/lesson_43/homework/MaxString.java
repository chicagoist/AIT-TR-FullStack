package lesson_43.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MaxString {


    //private String maxLongString;
    private String temp = "";

    public MaxString(String s) {
        File fileName = new File(s);
        temp = findMaxLongString(fileName);
    }

    private String findMaxLongString(File fileName) {

        try(BufferedReader reader =
                    new BufferedReader(new FileReader(fileName))) {
            String str;
            while((str = reader.readLine()) != null) {
                if(str.length() > temp.length()) {
                    temp = str;
                }
            }
        } catch(IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return temp;
    }

    public String getLongestString() {
        return temp;
    }
}
