package Task_2;

import java.util.*;

public class Dictionary {
    private HashMap<String, List<String>> dictionary = new HashMap<>();
    private HashMap<String, Integer> counter = new HashMap<>();

    public Dictionary() { }

    public HashMap<String, List<String>> getDictionary() {
        return dictionary;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Enter initial data for the dictionary");
            System.out.println("2. Display translations of a word");
            System.out.println("3. Add a translation to a word");
            System.out.println("4. Replace translations of a word");
            System.out.println("5. Delete a translation of a word");
            System.out.println("6. Add a new word");
            System.out.println("7. Delete a word");
            System.out.println("8. Top 10 most popular words");
            System.out.println("9. Top 10 least popular words");
            System.out.println("10. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> initializeDictionary(scanner);
                case 2 -> showTranslations(scanner);
                case 3 -> addTranslation(scanner);
                case 4 -> replaceTranslations(scanner);
                case 5 -> removeTranslation(scanner);
                case 6 -> addWord(scanner);
                case 7 -> deleteWord(scanner);
                case 8 -> showTopWords(true);
                case 9 -> showTopWords(false);
                case 10 -> {
                    System.out.println("Finish.");
                    return;
                }
                default -> System.out.println("Wring choice.");
            }
        }
    }

    public void initializeDictionary(Scanner scanner) {
        System.out.print("Enter word: ");
        String word = scanner.nextLine();
        System.out.print("Enter translation separated by comma: ");
        List<String> translations = List.of(scanner.nextLine().split(",\\s*"));
        dictionary.put(word, new ArrayList<>(translations));
        counter.put(word, 0);
        System.out.println("Word and translation.");
    }

    public void showTranslations(Scanner scanner) {
        System.out.print("Enter a word to view its translations: ");
        String word = scanner.nextLine();
        if (dictionary.containsKey(word)) {
            counter.put(word, counter.get(word) + 1);
            System.out.println("Translations for \"" + word + "\": " + dictionary.get(word));
        } else {
            System.out.println("The word was not found in the dictionary.");
        }
    }

    private void addTranslation(Scanner scanner) {
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.print("Enter a translation to add: ");
        String translation = scanner.nextLine();
        dictionary.computeIfAbsent(word, k -> new ArrayList<>());
        dictionary.get(word).add(translation);
        counter.putIfAbsent(word, 0);
        System.out.println("Translation added.");
    }

    public void replaceTranslations(Scanner scanner) {
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        if (dictionary.containsKey(word)) {
            System.out.print("Enter new translations (comma-separated): ");
            List<String> newTranslations = List.of(scanner.nextLine().split(",\\s*"));
            dictionary.put(word, new ArrayList<>(newTranslations));
            System.out.println("Translations updated.");
        } else {
            System.out.println("The word was not found in the dictionary.");
        }
    }

    public void removeTranslation(Scanner scanner) {
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        if (dictionary.containsKey(word)) {
            System.out.print("Enter a translation to remove: ");
            String translation = scanner.nextLine();
            dictionary.get(word).remove(translation);
            System.out.println("Translation removed.");
        } else {
            System.out.println("The word was not found in the dictionary.");
        }
    }

    public void addWord(Scanner scanner) {
        System.out.print("Enter a new word: ");
        String word = scanner.nextLine();
        if (!dictionary.containsKey(word)) {
            System.out.print("Enter translations (comma-separated): ");
            List<String> translations = List.of(scanner.nextLine().split(",\\s*"));
            dictionary.put(word, new ArrayList<>(translations));
            counter.put(word, 0);
            System.out.println("Word added to the dictionary.");
        } else {
            System.out.println("The word already exists in the dictionary.");
        }
    }

    public void deleteWord(Scanner scanner) {
        System.out.print("Enter a word to delete: ");
        String word = scanner.nextLine();
        if (dictionary.remove(word) != null) {
            counter.remove(word);
            System.out.println("Word deleted.");
        } else {
            System.out.println("The word was not found in the dictionary.");
        }
    }

    private List<Map.Entry<String, Integer>> getTopWords(boolean mostPopular) {
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(counter.entrySet());

        sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        if (!mostPopular)
            Collections.reverse(sortedWords);

        return sortedWords.subList(0, Math.min(10, sortedWords.size()));
    }

    private void showTopWords(boolean mostPopular) {
        List<Map.Entry<String, Integer>> topWords = getTopWords(mostPopular);

        if (mostPopular) {
            System.out.println("Top 10 most popular words:");
        } else {
            System.out.println("Top 10 least popular words:");
        }

        for (Map.Entry<String, Integer> entry : topWords) {
            System.out.println(entry.getKey() + " - accesses: " + entry.getValue());
        }
    }

}
