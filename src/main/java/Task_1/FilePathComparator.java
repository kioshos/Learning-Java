package Task_1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilePathComparator {
    public boolean compare(String filePath1, String filePath2) {
        boolean isMatch = true;
        try{
            List<String> firstPath = Files.readAllLines(Path.of(filePath1));
            List<String> secondPath = Files.readAllLines(Path.of(filePath2));

            for (int i = 0; i < firstPath.size() + secondPath.size(); i++) {
                String line1 = "";
                String line2 = "";
                if (i < firstPath.size()) {
                    line1 = firstPath.get(i);
                }
                if (i < secondPath.size()) {
                    line2 = secondPath.get(i);
                }

                if(!line1.equals(line2)){
                    isMatch = false;
                    System.out.println("Line from first file: " + line1);
                    System.out.println("Line from second file: " + line2);
                }
            }

        }catch (Exception e){
            System.out.println(e);
            return false;
        }
        return isMatch;
    }
}


