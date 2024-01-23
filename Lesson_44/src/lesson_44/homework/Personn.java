package lesson_44.homework;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Personn implements Comparable<Personn> {

    private String name = "";
    private int age = 0;

    public Personn(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "name = " + name + ", age = " + age;
    }

    @Override
    public int compareTo(Personn obj) {
        return this.age - obj.age;
    }

    public static List<Personn> composeList(String filename) {
        List<Personn> persons = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        try(BufferedReader bufferReader =
                    new BufferedReader(new FileReader(filename))) {
            String line;

            while((line = bufferReader.readLine()) != null) {
                temp.add(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        for(String s : temp) {
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());

            if(age > 18) {
                persons.add(new Personn(nameAge[0].trim(), age));
            }
        }
        Collections.sort(persons);
        return persons;
    }
}

