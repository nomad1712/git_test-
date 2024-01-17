import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileSizeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Process for entering the name for the first 
        System.out.print("Enter the first file name: ");
        String filename1 = scanner.nextLine();
        File file1 = new File(filename1);

        System.out.print("Enter the second file name: ");
        String filename2 = scanner.nextLine();
        File file2 = new File(filename2);

        long size1 = 0;
        long size2 = 0;

        try {
            size1 = Files.size(Paths.get(filename1));
            size2 = Files.size(Paths.get(filename2));
        } catch (Exception e) {
            System.out.println("Error reading file size: " + e.getMessage());
            return;
        }

        double ratio = (double) size1 / size2;

        System.out.println("File 1 size: " + size1 + " bytes");
        System.out.println("File 2 size: " + size2 + " bytes");
        System.out.println("Ratio of file sizes: " + ratio);
    }
}