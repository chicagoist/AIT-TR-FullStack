package lesson_32_classwork_words;

public class Main {
    public static void main(String[] args) {
        Wordelized modifier = new WordChanger();
        String sentence = "привет чай ВХОД монитор house";

        String modifiedSentence = modifier.changeWords(sentence);
        System.out.println(modifiedSentence);
    }
}


/*
Дана строка, состоящая из слов, разделённых пробелом. Написать единственный
метод в интерфейсе , позволяющий изменять слова в данной строке следующим
образом:
1. При длине слова в три буквы - изменять все буквы этого слова на заглавные.
2. При длине слова в четыре буквы - изменять все буквы этого слова на строчные.
3. при длине слова в пять букв - заменять все буквы этого слова символами
звёздочка.
Использовать интерфейс, StringBuilder

 */