package lesson_32_classwork_words;

public class WordChanger implements Wordelized {
    @Override
    public String changeWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int wordLength = word.length();

            if (wordLength == 3) {
                result.append(word.toUpperCase()).append(" ");
            } else if (wordLength == 4) {
                result.append(word.toLowerCase()).append(" ");
            } else if (wordLength == 5) {
                result.append("*".repeat(wordLength)).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString();
    }
}
