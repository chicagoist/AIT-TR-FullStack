package lesson_44.classwork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {

    private String name = "";
    private int age = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person obj) {
        return this.age - obj.age;
    }

    public static List<Person> composeList(String filename) {
        List<Person> persons = new ArrayList<>();
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
                persons.add(new Person(nameAge[0].trim(), age));
            }
        }
            Collections.sort(persons);
            return persons;
        }
    }
