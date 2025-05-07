package Task_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CreateCopyOfFilesHandler {
    public void copyFile(String source, String destination) throws IOException {
        Path sourceDir = Paths.get(source);
        Path targetDir = Paths.get(destination);

        if (!Files.exists(sourceDir) || !Files.isDirectory(sourceDir)) {
            System.out.println("There is no such file or directory.");
            return;
        }
        if (!Files.exists(targetDir)) {
            Files.createDirectories(targetDir);
        }

        Files.list(sourceDir).forEach(file -> {
            try {
                if (Files.isRegularFile(file)) {
                    Path targetFile = targetDir.resolve(file.getFileName());
                    Files.copy(file, targetFile, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("File has been copied: " + file.getFileName());
                }
            } catch (IOException e) {
                System.out.println("Error has been occurred while copying " + file.getFileName());
                e.printStackTrace();
            }
        });
    }
}
