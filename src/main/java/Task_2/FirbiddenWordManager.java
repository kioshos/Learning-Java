package Task_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FirbiddenWordManager {
    private static final File FILE_WITH_FORBIDDEN_WORDS = new File("ForbiddenWords");
    private static final Scanner SCANNER = new Scanner(System.in);

    public void readFilesInDirectory(String directoryPath) throws FileNotFoundException {

        File[] listOfFiles = new File(directoryPath).listFiles();

        Scanner readForbiddenWords = new Scanner(FILE_WITH_FORBIDDEN_WORDS);
        String[] forbiddenWords = readForbiddenWords.nextLine().split(" ");

        try{

            for (File file : listOfFiles) {
                processFile(file, forbiddenWords);
            }

        }catch (IOException e){
            System.out.println("Error has been occurred while reading " + directoryPath);
        }

    }

    private static void processFile(File file, String[] forbiddenWords) throws IOException {

        String content = Files.readString(file.toPath());
        String[] words = content.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < forbiddenWords.length; i++){
            for(int j = 0; j < words.length; j++){
                if(forbiddenWords[i].equalsIgnoreCase(words[j])){
                    map.put(forbiddenWords[i], map.getOrDefault(forbiddenWords[i], 0) + 1);
                }
            }
        }

        if(!map.isEmpty()){
            map.forEach((k, v) -> System.out.println(k + " found " + v + " times"));
            System.out.println("Do you wanna censor these words? (y/n)");

            if(SCANNER.nextLine().toLowerCase().equals("y")){
                for(String word : map.keySet()){
                    content = new StringBuilder(content.toString().replaceAll("(?i)\\b" + Pattern.quote(word) + "\\b", "*".repeat(word.length()))).toString();

                }
                Files.writeString(file.toPath(), content);
            }
        }

    }


}
