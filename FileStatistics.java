import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class FileStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();
        File file = new File(filename);

        Path path = Paths.get(filename);

        BasicFileAttributes attributes;
        try {
            attributes = Files.readAttributes(path, BasicFileAttributes.class);
        } catch (Exception e) {
            System.out.println("Error reading file attributes: " + e.getMessage());
            return;
        }

        long size = attributes.size();
        LocalDateTime lastModifiedTime = LocalDateTime.ofInstant(attributes.lastModifiedTime().toInstant(), ZoneId.systemDefault());
        String folder = path.getParent().toString();

        System.out.println("File path: " + path);
        System.out.println("File name: " + path.getFileName());
        System.out.println("Folder: " + folder);
        System.out.println("Size: " + size + " bytes");
        System.out.println("Last modified: " + lastModifiedTime);
    }
}