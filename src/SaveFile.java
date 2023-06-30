import java.io.FileWriter;
import java.io.IOException;

public class SaveFile
{
    public static void save(String nameFile, String message) {
        String fileName = nameFile;
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(message);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
